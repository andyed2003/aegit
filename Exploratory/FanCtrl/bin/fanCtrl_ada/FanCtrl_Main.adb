with FanCtrl_Globals, Ada.Real_Time, Ada.Text_IO, Ada.Integer_Text_IO;
use FanCtrl_Globals, Ada.Real_Time, Ada.Text_IO, Ada.Integer_Text_IO;
procedure FanCtrl_Main is 
	task EnvNewImpl is 
		pragma priority(5);
		entry read(p1:  out Integer; p2:  out Integer; p3:  out Integer);
		entry write(p1:  in boolean);
	end EnvNewImpl;
	task body EnvNewImpl is 
		package Bool_IO is new Enumeration_IO(Boolean);
		use Bool_IO;
		E_LM75_tempPSU : Integer := 0;
		E_LM75_tempAmbient : Integer := 0;
		E_MAX6650_fanSpeed : Integer := 3000;
		E_MAX6650_fanOn : boolean := true;
		period: constant Time_Span := To_Time_Span(0.1);
		nextTime: Time := clock + period;
	begin 
		loop 
			delay until nextTime;
			if ((E_MAX6650_fanOn = false)) then 
				E_LM75_tempAmbient := (E_LM75_tempAmbient + 1000);
				E_LM75_tempPSU := (E_LM75_tempPSU + 1000);
				E_MAX6650_fanSpeed := 0;
			else 
				E_LM75_tempAmbient := ((E_LM75_tempAmbient) - 1000);
				E_LM75_tempPSU := ((E_LM75_tempPSU) - 1000);
				E_MAX6650_fanSpeed := 3000;
			end if;
			put("E_LM75_tempPSU:  "); put(E_LM75_tempPSU); New_Line;
			put("E_MAX6650_fanSpeed:  "); put(E_MAX6650_fanSpeed); New_Line;
			put("E_MAX6650_fanOn:  "); put(E_MAX6650_fanOn); New_Line;
			select 
				accept read(p1:  out Integer; p2:  out Integer; p3:  out Integer) do 
				begin 
					p1 := E_MAX6650_fanSpeed;
					p2 := E_LM75_tempAmbient;
					p3 := E_LM75_tempPSU;
				end; 
				end read;
				or 
				accept write(p1:  in boolean) do 
				begin 
					E_MAX6650_fanOn := p1;
				end; 
				end write;
			else 
				null;
			end select;
			nextTime := nextTime + period;
		end loop; 
	end EnvNewImpl;
	task ControllerNewImpl is 
		pragma priority(5);
	end ControllerNewImpl;
	task body ControllerNewImpl is 
		package Bool_IO is new Enumeration_IO(Boolean);
		use Bool_IO;
		Controller : Controller_STATES := Step;
		C_tempPSU : Integer := 0;
		C_tempAmbient : Integer := 0;
		C_fanSpeed : Integer := 3000;
		C_fanOn : boolean := true;
		failureCount : Integer := 0;
		period: constant Time_Span := To_Time_Span(0.1);
		nextTime: Time := clock + period;
		procedure ControllerstateMachine is 
		begin 
			case Controller is
			when Step => 
			Controller := Control;
			when Control => 
			if ((not((((C_tempPSU >= HWM_PSU)) or ((C_tempAmbient >= HWM_AMBIENT))))) and (not((((C_tempPSU <= LWM_PSU)) and ((C_tempAmbient <= LWM_AMBIENT)))))) then 
				Controller := Normal;
			elsif ((((C_tempPSU >= HWM_PSU)) or ((C_tempAmbient >= HWM_AMBIENT)))) then 
				Controller := Normal;
				C_fanOn := true;
			elsif ((((C_tempPSU <= LWM_PSU)) and ((C_tempAmbient <= LWM_AMBIENT)))) then 
				Controller := Normal;
				C_fanOn := false;
			end if;
			when Normal => 
			Controller := SpeedCheck;
			when SpeedCheck => 
			if ((((C_fanOn = false)) or ((C_fanSpeed < FAN_SPEED_FAULT))) and (((C_fanOn = true)) or ((C_fanSpeed > FAN_SPEED_OFF)))) then 
				Controller := FailureCount;
			elsif ((((C_fanOn = false)) or ((C_fanSpeed >= FAN_SPEED_FAULT))) and (((C_fanOn = true)) or ((C_fanSpeed <= FAN_SPEED_OFF)))) then 
				Controller := Step;
				failureCount := 0;
			end if;
			when FailureCount => 
			if ((failureCount <= FAILURES_TOLARABLE)) then 
				Controller := Step;
			elsif ((failureCount > FAILURES_TOLARABLE)) then 
				Controller := Broken;
			end if;
			when Broken => 
			Controller := BrokenSpeedCheck;
			when BrokenSpeedCheck => 
			if ((((C_fanOn = true)) or ((C_fanSpeed > FAN_SPEED_OFF))) and (((C_fanOn = false)) or ((C_fanSpeed < FAN_SPEED_FAULT)))) then 
				Controller := Broken;
			elsif ((((C_fanOn = true)) or ((C_fanSpeed <= FAN_SPEED_OFF))) and (((C_fanOn = false)) or ((C_fanSpeed >= FAN_SPEED_FAULT)))) then 
				Controller := Step;
			end if;
		end case;
	end ControllerstateMachine;
begin 
	loop 
		delay until nextTime;
		ControllerstateMachine;
		EnvNewImpl.write(C_fanOn);
		if ((Controller /= Normal)) then 
			EnvNewImpl.read(C_fanSpeed, C_tempAmbient, C_tempPSU);
		end if;
		put("C_fanSpeed:  "); put(C_fanSpeed); New_Line;
		put("C_fanOn:  "); put(C_fanOn); New_Line;
		nextTime := nextTime + period;
	end loop; 
end ControllerNewImpl;
begin 
null; 
end FanCtrl_Main;
