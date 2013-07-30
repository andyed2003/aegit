#include "Common.h"
#include "fakeFMIDecls.h"

#include <stdio.h>
#include <stdlib.h>

controllerSM_STATES controllerSM_controllerImpl = ready;

struct fmiComponent *modelInstances[MaxControllerModels]; // start of with an empty array of components
int conInstanceCount = 0;

// Subroutines
void controllerImpl_controllerSMstateMachine() {
	// Translated code
	switch (controllerSM_controllerImpl) {
	case ready:
//		if (c_Level_controllerImpl < Low) {
//			c_time_controllerImpl = (c_time_controllerImpl + ComputeDelay);
//			c_pumpOn_controllerImpl = TRUE;
//		} else if (c_Level_controllerImpl > High) {
//			c_pumpOn_controllerImpl = FALSE;
//			c_time_controllerImpl = (c_time_controllerImpl + ComputeDelay);
//		} else if (c_Level_controllerImpl >= Low
//				&& c_Level_controllerImpl <= High) {
//			c_time_controllerImpl = (c_time_controllerImpl + ComputeDelay);
//		}
		break;
	}

}

// a minimal constructor
struct fmiComponent* fmiInstantiateControllerImpl(fmiString instanceName,
		fmiString GUID) {
	// create a fmiComponent and allocate storage space
	struct fmiComponent *newFMIComponent = malloc(sizeof(*newFMIComponent));
	if (!(conInstanceCount <= (MaxControllerModels - 1))) {
		newFMIComponent->validInstance = fmiFalse;
		return newFMIComponent;
	} else {
		newFMIComponent->validInstance = fmiTrue;
		// set the name etc
		newFMIComponent->fmuInstanceName = instanceName;
		newFMIComponent->fmuGUID = GUID;
		newFMIComponent->i[c_Level_controllerImpl_] = 0; //initialise variable c_Level_controllerImpl
		newFMIComponent->i[c_time_controllerImpl_] = 0; //initialise variable c_time_controllerImpl
		newFMIComponent->b[c_pumpOn_controllerImpl_] = fmiFalse; //initialise variable c_pumpOn_controllerImpl_
		//add instance to collection;
		modelInstances[conInstanceCount] = newFMIComponent;
		conInstanceCount = conInstanceCount + 1;
		return newFMIComponent;
	}
}

// The master uses this function to get the controller's decision
// about the pump command.
void controller_fmiGetBoolean(struct fmiComponent *c,
		const fmiValueReference vr[c_booleanArraySize], size_t nvr,
		fmiBoolean value[c_booleanArraySize]) {
	value[c_pumpOn_controllerImpl_] = c->b[vr[c_pumpOn_controllerImpl_]];

	printf("return value c_pumpOn... : %i\n", value[c_pumpOn_controllerImpl_]);

}

// The master communicates the integer value of the level,
// to the controller, passed from the environment
void controller_fmiSetInteger(struct fmiComponent *c,
		const fmiValueReference vr[c_integerArraySize], size_t nvr,
		fmiInteger value[c_integerArraySize]) {
	c->i[vr[c_Level_controllerImpl_]] = value[c_Level_controllerImpl_];
	c->i[vr[c_time_controllerImpl_]] = value[c_time_controllerImpl_];

	printf("set value c_Level_controllerImpl_... : %u\n",
			value[c_Level_controllerImpl_]);
	printf("set value c_time_controllerImpl_ ... : %u\n",
			value[c_time_controllerImpl_]);

}

// the simulation step.
void controller_fmiDoStep(struct fmiComponent* f) {

	// Translated code
	controllerImpl_controllerSMstateMachine();
//	printf("c_Level %i\n", c_Level_controllerImpl);
}
