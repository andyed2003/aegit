
package FanCtrl_Globals is 
FAILURES_TOLARABLE : constant Integer := 4;
Step : constant Controller_STATES := null;
FAN_SPEED_FAULT : constant Integer := 1000;
HWM_AMBIENT : constant Integer := 40000;
SpeedCheck : constant Controller_STATES := null;
HWM_PSU : constant Integer := 37000;
Control : constant Controller_STATES := null;
BrokenSpeedCheck : constant Controller_STATES := null;
FailureCount : constant Controller_STATES := null;
LWM_AMBIENT : constant Integer := 32000;
Normal : constant Controller_STATES := null;
Broken : constant Controller_STATES := null;
LWM_PSU : constant Integer := 32000;
FAN_SPEED_OFF : constant Integer := 0;
type Controller_STATES is (Step, Control, Normal, SpeedCheck, FailureCount, Broken, BrokenSpeedCheck);
for Controller_STATES use 
(Step => 0, Control=>1, Normal=>2, SpeedCheck=>3, FailureCount=>4, Broken=>5, BrokenSpeedCheck=>6);
end FanCtrl_Globals;
