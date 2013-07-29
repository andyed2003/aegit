#include "Common.h"

// Variables and constants
environSM_STATES environSM_environmentImpl = stableSim;
int fmi_Level_environmentImpl = 1000;
BOOL fmi_PumpOn_environmentImpl = FALSE;
int fmi_time_environmentImpl = 0;
const int priority_environmentImpl = 5;

// Subroutines
void environmentImpl_environSMstateMachine() {
	// Translated code
	switch (environSM_environmentImpl) {
	case stableSim:
		if (fmi_PumpOn_environmentImpl == FALSE) {
			fmi_Level_environmentImpl = ((fmi_Level_environmentImpl) - 1);
		} else if (fmi_PumpOn_environmentImpl == TRUE) {
			fmi_Level_environmentImpl = (fmi_Level_environmentImpl + 1);
		}
		break;
	}
}

// The master gets the level from the environment using this function
void environmentImpl_fmiGetInteger(int *p) {
	fmi_time_environmentImpl = (fmi_time_environmentImpl + ReadDelay);
	(*p) = fmi_Level_environmentImpl;
}

// The master sets the pump on command from the controller using this
void environmentImpl_fmiSetBoolean(BOOL* p) {
	fmi_PumpOn_environmentImpl = *p;
	fmi_time_environmentImpl = (fmi_time_environmentImpl + ReadDelay);

}

// The simulation step
void environmentImpl_fmiDoStep() {
	environmentImpl_environSMstateMachine();
	printf("fmiLevel:  %i\n", fmi_Level_environmentImpl);
	printf("fmi_PumpOn:  %i\n", fmi_PumpOn_environmentImpl);
}
