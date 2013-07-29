#include "Common.h"
#include "fakeFMIDecls.h"

#include <stdio.h>
#include <stdlib.h>

// Variables and constants
int c_Level_controllerImpl;
BOOL c_pumpOn_controllerImpl = FALSE;
int c_time_controllerImpl = 0;
controllerSM_STATES controllerSM_controllerImpl = ready;


fmiComponent *modelInstances[MaxModels];       // start of with an empty array of components
int instanceCount = 0;

// Subroutines
void controllerImpl_controllerSMstateMachine() {
	// Translated code
	switch (controllerSM_controllerImpl) {
	case ready:
		if (c_Level_controllerImpl < Low) {
			c_time_controllerImpl = (c_time_controllerImpl + ComputeDelay);
			c_pumpOn_controllerImpl = TRUE;
		} else if (c_Level_controllerImpl > High) {
			c_pumpOn_controllerImpl = FALSE;
			c_time_controllerImpl = (c_time_controllerImpl + ComputeDelay);
		} else if (c_Level_controllerImpl >= Low
				&& c_Level_controllerImpl <= High) {
			c_time_controllerImpl = (c_time_controllerImpl + ComputeDelay);
		}
		break;
	}

}

// a minimal constructor
fmiComponent fmiInstantiateControllerImpl(fmiString instanceName, fmiString GUID) {
	if(!(instanceCount <= (MaxModels - 1)) ){
		return fmiUndefinedFMIComponent;
	}
	// create a fmiComponent and allocate storage space
	struct fmiComponent *newFMIComponent = malloc(sizeof (*newFMIComponent));
	// set the name etc
	newFMIComponent->fmuInstanceName = instanceName;
	newFMIComponent->fmuGUID = GUID;
	//add instance to collection;
	modelInstances[instanceCount] = newFMIComponent;
	instanceCount = instanceCount + 1;
	return newFMIComponent;
}

// The master uses this function to get the controller's decision
// about the pump command.
void controller_fmiGetBoolean(BOOL* b) {
	*b = c_pumpOn_controllerImpl;
}

// The master communicates the integer value of the level,
// to the controller, passed from the environment
void controller_fmiSetInteger(int* i) {
	c_Level_controllerImpl = *i;
}

// the simulation step.
void controller_fmiDoStep() {
	// Translated code
	controllerImpl_controllerSMstateMachine();
	printf("c_Level %i\n", c_Level_controllerImpl);
}
