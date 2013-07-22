#include "Common.h"
// Task: controllerImpl

// Variables and constants
 c_Level_controllerImpl;
 c_pumpOn_controllerImpl = FALSE;
 c_time_controllerImpl = 0;
controllerSM_STATES controllerSM_controllerImpl = ready;
const int priority_controllerImpl = 5;


// Subroutines
void controllerImpl_controllerSMstateMachine()
{
	#pragma omp critical (CONTROLLERIMPL)
	{
		// Translated code
		switch(controllerSM_controllerImpl)
		{
			case ready:
			if (c_Level_controllerImpl < Low)
			{
				c_time_controllerImpl ≔ ();
				c_pumpOn_controllerImpl = TRUE;
			}
			else if (c_Level_controllerImpl > High)
			{
				c_pumpOn_controllerImpl = FALSE;
				c_time_controllerImpl ≔ ();
			}
			else if (c_Level_controllerImpl ≥ Low && c_Level_controllerImpl ≤ High)
			{
				c_time_controllerImpl ≔ ();
			}
			break;
		}
	}
}

void controllerImpl()
{
	while(TRUE)
	{
		// [Internal] Timer information for repeating or periodic tasks
		double internalPeriodicStartTime = omp_get_wtime();
		double internalTimeDifference;
		
		// Translated code
		controllerImpl_controllerSMstateMachine();
		environmentImpl_writePump(c_pumpOn_controllerImpl);
		environmentImpl_readLevel(&c_Level_controllerImpl);
		printf("c_Level %i\n", c_Level_controllerImpl);
		
		// [Internal] Code to monitor time between periodic tasks
		internalTimeDifference = omp_get_wtime() - internalPeriodicStartTime;
		__SLEEP(100 - (internalTimeDifference * 1000));
	}
}
