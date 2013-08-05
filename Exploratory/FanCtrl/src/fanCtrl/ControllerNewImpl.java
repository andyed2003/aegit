package fanCtrl;
import static simpleProject.MainEntry.Controller_STATES.*;
import simpleProject.MainEntry.Controller_STATES;
import static simpleProject.MainEntry.*;
// Task: ControllerNewImpl

public class ControllerNewImpl implements Runnable
{
	
	// Instance variables and constants
	protected Controller_STATES Controller = Step;
	protected  C_tempPSU = 0;
	protected  C_tempAmbient = 0;
	protected  C_fanSpeed = 3000;
	protected  C_fanOn = TRUE;
	protected  failureCount = 0;
	protected int priority = 5;
	
	public ControllerNewImpl()
	{
	}
	
	public void run()
	{
		while(true)
		{
			// [Internal] Timer information for repeating or periodic tasks
			long THREAD_START_TIME = System.currentTimeMillis();
			
			// Translated code
			((ControllerNewImpl)MainEntry.getTask("ControllerNewImpl")).ControllerstateMachine();
			((EnvNewImpl)MainEntry.getTask("EnvNewImpl")).write(C_fanOn);
			if (Controller ≠ Normal)
			{
				Pointer<> C_fanSpeedPointer = new Pointer<>();
				Pointer<> C_tempAmbientPointer = new Pointer<>();
				Pointer<> C_tempPSUPointer = new Pointer<>();
				((EnvNewImpl)MainEntry.getTask("EnvNewImpl")).read(C_fanSpeedPointer, C_tempAmbientPointer, C_tempPSUPointer);
				C_fanSpeed = C_fanSpeedPointer.value;
				C_tempAmbient = C_tempAmbientPointer.value;
				C_tempPSU = C_tempPSUPointer.value;
			}
			System.out.println("C_fanSpeed: " + C_fanSpeed);
			System.out.println("C_fanOn: " + C_fanOn);
			
			// [Internal] Code to monitor time between periodic tasks
			long THREAD_END_TIME = System.currentTimeMillis();
			long THREAD_TIME_TAKEN = THREAD_END_TIME - THREAD_START_TIME;
			try
			{
				Thread.sleep(Math.max(100 - THREAD_TIME_TAKEN,0));
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	// Subroutines
	public void ControllerstateMachine()
	{
		// Translated code
		switch(Controller)
		{
			case Step:
			Controller = Control;
			break;
			case Control:
			if ((¬(((C_tempPSU≥HWM_PSU)∨(C_tempAmbient≥HWM_AMBIENT)))) && (¬(((C_tempPSU≤LWM_PSU)∧(C_tempAmbient≤LWM_AMBIENT)))))
			{
				Controller = Normal;
			}
			else if (((C_tempPSU≥HWM_PSU)∨(C_tempAmbient≥HWM_AMBIENT)))
			{
				Controller = Normal;
				C_fanOn = TRUE;
			}
			else if (((C_tempPSU≤LWM_PSU)∧(C_tempAmbient≤LWM_AMBIENT)))
			{
				Controller = Normal;
				C_fanOn = FALSE;
			}
			break;
			case Normal:
			Controller = SpeedCheck;
			break;
			case SpeedCheck:
			if (((C_fanOn=FALSE)∨(C_fanSpeed<FAN_SPEED_FAULT)) && ((C_fanOn=TRUE)∨(C_fanSpeed>FAN_SPEED_OFF)))
			{
				Controller = FailureCount;
			}
			else if (((C_fanOn=FALSE)∨(C_fanSpeed≥FAN_SPEED_FAULT)) && ((C_fanOn=TRUE)∨(C_fanSpeed≤FAN_SPEED_OFF)))
			{
				Controller = Step;
				failureCount = 0;
			}
			break;
			case FailureCount:
			if (failureCount ≤ FAILURES_TOLARABLE)
			{
				Controller = Step;
			}
			else if (failureCount > FAILURES_TOLARABLE)
			{
				Controller = Broken;
			}
			break;
			case Broken:
			Controller = BrokenSpeedCheck;
			break;
			case BrokenSpeedCheck:
			if (((C_fanOn=TRUE)∨(C_fanSpeed>FAN_SPEED_OFF)) && ((C_fanOn=FALSE)∨(C_fanSpeed<FAN_SPEED_FAULT)))
			{
				Controller = Broken;
			}
			else if (((C_fanOn=TRUE)∨(C_fanSpeed≤FAN_SPEED_OFF)) && ((C_fanOn=FALSE)∨(C_fanSpeed≥FAN_SPEED_FAULT)))
			{
				Controller = Step;
			}
			break;
		}
	}
	
	public int getPriority()
	{
		return priority;
	}
	
}
