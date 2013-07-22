#include "Common.h"
// EnvironTask: environmentImpl

// Variables and constants
environSM_STATES environSM_environmentImpl = stableSim;
 fmi_Level_environmentImpl = 1000;
 fmi_PumpOn_environmentImpl = FALSE;
 fmi_time_environmentImpl = 0;
const int priority_environmentImpl = 5;


// Subroutines
void environmentImpl_environSMstateMachine()
{
	// [Internal] This will block until the guard has been met (no nice way of doing this in OpenMP 2.5)
	BOOL completed = FALSE; 	 // [Internal] Private to the thread by default
	while(!completed)
	{
		// [Internal] Try and get lock
		#pragma omp critical (ENVIRONMENTIMPL)
		{
			// Translated code
			switch(environSM_environmentImpl)
			{
				case stableSim:
				if (fmi_PumpOn_environmentImpl = FALSE)
				{
					fmi_Level_environmentImpl ≔ ((fmi_Level_environmentImpl) - 1);
				}
				else if (fmi_PumpOn_environmentImpl = TRUE)
				{
					fmi_Level_environmentImpl ≔ ();
				}
				break;
			}
			// [Internal] Set completed flag
			completed = TRUE;
		}
	}
}

void environmentImpl_readLevel( *p)
{
	// [Internal] This will block until the guard has been met (no nice way of doing this in OpenMP 2.5)
	BOOL completed = FALSE; 	 // [Internal] Private to the thread by default
	while(!completed)
	{
		// [Internal] Try and get lock
		#pragma omp critical (ENVIRONMENTIMPL)
		{
			// Translated code
			fmi_time_environmentImpl ≔ ();
			(*p)= fmi_Level_environmentImpl ;
			// [Internal] Set completed flag
			completed = TRUE;
		}
	}
}

void environmentImpl_writePump( p)
{
	// [Internal] This will block until the guard has been met (no nice way of doing this in OpenMP 2.5)
	BOOL completed = FALSE; 	 // [Internal] Private to the thread by default
	while(!completed)
	{
		// [Internal] Try and get lock
		#pragma omp critical (ENVIRONMENTIMPL)
		{
			// Translated code
			fmi_PumpOn_environmentImpl = p;
			fmi_time_environmentImpl ≔ ();
			// [Internal] Set completed flag
			completed = TRUE;
		}
	}
}

void environmentImpl()
{
	while(TRUE)
	{
		// [Internal] Timer information for repeating or periodic tasks
		double internalPeriodicStartTime = omp_get_wtime();
		double internalTimeDifference;
		environmentImpl_environSMstateMachine();
		printf("fmiLevel:  %i\n", fmi_Level_environmentImpl);
		printf("fmi_PumpOn:  %i\n", fmi_PumpOn_environmentImpl);
		
		// [Internal] Code to monitor time between periodic tasks
		internalTimeDifference = omp_get_wtime() - internalPeriodicStartTime;
		__SLEEP(100 - (internalTimeDifference * 1000));
	}
}
