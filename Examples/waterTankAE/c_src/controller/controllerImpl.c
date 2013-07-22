#include "Common.h"

// Variables and constants
int c_Level_controllerImpl;
BOOL c_pumpOn_controllerImpl = FALSE;
int c_time_controllerImpl = 0;
controllerSM_STATES controllerSM_controllerImpl = ready;

// Subroutines
void controllerImpl_controllerSMstateMachine()
{
		// Translated code
		switch(controllerSM_controllerImpl)
		{
			case ready:
			if (c_Level_controllerImpl < Low)
			{
				c_time_controllerImpl = (c_time_controllerImpl + ComputeDelay);
				c_pumpOn_controllerImpl = TRUE;
			}
			else if (c_Level_controllerImpl > High)
			{
				c_pumpOn_controllerImpl = FALSE;
				c_time_controllerImpl = (c_time_controllerImpl + ComputeDelay);
			}
			else if (c_Level_controllerImpl >= Low && c_Level_controllerImpl <= High)
			{
				c_time_controllerImpl = (c_time_controllerImpl + ComputeDelay);
			}
			break;
		}

}

void controller_fmiSetBoolean(c_pumpOn_controllerImpl) {
	environmentImpl_writePump (c_pumpOn_controllerImpl);
}

void controller_fmiGetInteger(* c_Level_controllerImpl)
{
	environmentImpl_readLevel(&c_Level_controllerImpl);
}

void controller_fmiDoStep()
{
		// Translated code
		controllerImpl_controllerSMstateMachine();
		printf("c_Level %i\n", c_Level_controllerImpl);
}
