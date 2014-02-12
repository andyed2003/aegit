package fanCtrl_java;

import static fanCtrl_java.MainEntry.Controller_STATES.*;
import fanCtrl_java.MainEntry.Controller_STATES;
import static fanCtrl_java.MainEntry.*;

// Task: ControllerNewImpl

public class ControllerNewImpl implements Runnable {

	// Instance variables and constants
	protected Controller_STATES Controller = Step;
	protected int C_tempPSU = 0;
	protected int C_tempAmbient = 0;
	protected int C_fanSpeed = 3000;
	protected boolean C_fanOn = true;
	protected int failureCount = 0;
	protected int priority = 5;

	public ControllerNewImpl() {
	}

	public void run() {
		while (true) {
			// [Internal] Timer information for repeating or periodic tasks
			long THREAD_START_TIME = System.currentTimeMillis();

			// Translated code
			((ControllerNewImpl) MainEntry.getTask("ControllerNewImpl"))
					.ControllerstateMachine();
			((EnvNewImpl) MainEntry.getTask("EnvNewImpl")).write(C_fanOn);
			if ((Controller != Normal)) {
				Pointer<Integer> C_fanSpeedPointer = new Pointer<Integer>();
				Pointer<Integer> C_tempAmbientPointer = new Pointer<Integer>();
				Pointer<Integer> C_tempPSUPointer = new Pointer<Integer>();
				((EnvNewImpl) MainEntry.getTask("EnvNewImpl")).read(
						C_fanSpeedPointer, C_tempAmbientPointer,
						C_tempPSUPointer);
				C_fanSpeed = C_fanSpeedPointer.value;
				C_tempAmbient = C_tempAmbientPointer.value;
				C_tempPSU = C_tempPSUPointer.value;
			}
			System.out.println("C_fanSpeed: " + C_fanSpeed);
			System.out.println("C_fanOn: " + C_fanOn);

			// [Internal] Code to monitor time between periodic tasks
			long THREAD_END_TIME = System.currentTimeMillis();
			long THREAD_TIME_TAKEN = THREAD_END_TIME - THREAD_START_TIME;
			try {
				Thread.sleep(Math.max(100 - THREAD_TIME_TAKEN, 0));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// Subroutines
	public void ControllerstateMachine() {
		// Translated code
		switch (Controller) {
		case Step:
			Controller = Control;
			break;
		case Control:
			if ((!((C_tempPSU >= HWM_PSU) || (C_tempAmbient >= HWM_AMBIENT)))
					&& (!((C_tempPSU <= LWM_PSU) && (C_tempAmbient <= LWM_AMBIENT)))) {
				Controller = Normal;
			} else if (((C_tempPSU >= HWM_PSU) || (C_tempAmbient >= HWM_AMBIENT))) {
				Controller = Normal;
				C_fanOn = true;
			} else if (((C_tempPSU <= LWM_PSU) && (C_tempAmbient <= LWM_AMBIENT))) {
				Controller = Normal;
				C_fanOn = false;
			}
			break;
		case Normal:
			Controller = SpeedCheck;
			break;
		case SpeedCheck:
			if (((C_fanOn == false) || (C_fanSpeed < FAN_SPEED_FAULT))
					&& ((C_fanOn == true) || (C_fanSpeed > FAN_SPEED_OFF))) {
				Controller = FailureCount;
			} else if (((C_fanOn == false) || (C_fanSpeed >= FAN_SPEED_FAULT))
					&& ((C_fanOn == true) || (C_fanSpeed <= FAN_SPEED_OFF))) {
				Controller = Step;
				failureCount = 0;
			}
			break;
		case FailureCount:
			if ((failureCount <= FAILURES_TOLARABLE)) {
				Controller = Step;
			} else if ((failureCount > FAILURES_TOLARABLE)) {
				Controller = Broken;
			}
			break;
		case Broken:
			Controller = BrokenSpeedCheck;
			break;
		case BrokenSpeedCheck:
			if (((C_fanOn == true) || (C_fanSpeed > FAN_SPEED_OFF))
					&& ((C_fanOn == false) || (C_fanSpeed < FAN_SPEED_FAULT))) {
				Controller = Broken;
			} else if (((C_fanOn == true) || (C_fanSpeed <= FAN_SPEED_OFF))
					&& ((C_fanOn == false) || (C_fanSpeed >= FAN_SPEED_FAULT))) {
				Controller = Step;
			}
			break;
		}
	}

	public int getPriority() {
		return priority;
	}

}
