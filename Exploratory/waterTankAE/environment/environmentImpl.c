#include  <stdlib.h>
#include "Common.h"
#include "fakeFMIDecls.h"

environSM_STATES environSM_environmentImpl = stableSim;

int envInstanceCount = 0;
struct fmiComponent *modelInstances[MaxEnviromentModels];

// Subroutines
void environmentImpl_environSMstateMachine() {
	// Translated code
	switch (environSM_environmentImpl) {
	case stableSim:
//		if (fmi_PumpOn_environmentImpl == FALSE) {
//			fmi_Level_environmentImpl = ((fmi_Level_environmentImpl) - 1);
//		} else if (fmi_PumpOn_environmentImpl == TRUE) {
//			fmi_Level_environmentImpl = (fmi_Level_environmentImpl + 1);
//		}
		break;
	}
}

// a minimal constructor
struct fmiComponent* fmiInstantiateEnvironmentImplImpl(fmiString instanceName,
		fmiString GUID) {
	// create a fmiComponent and allocate storage space
	struct fmiComponent *newFMIComponent = malloc(sizeof(*newFMIComponent));
	if (!(envInstanceCount <= (MaxEnviromentModels - 1))) {
		newFMIComponent->validInstance = fmiFalse;
		return newFMIComponent;
	} else {
		newFMIComponent->validInstance = fmiTrue;
		// set the name etc
		newFMIComponent->fmuInstanceName = instanceName;
		newFMIComponent->fmuGUID = GUID;
		newFMIComponent->i[env_Level_environmentImpl_] = 1000; //initialise variable fmi_Level_environmentImpl
		newFMIComponent->b[env_pumpOn_environmentImpl_] = fmiFalse; //initialise variable fmi_pumpOn_environmentImpl
		//add instance to collection;
		modelInstances[envInstanceCount] = newFMIComponent;
		envInstanceCount = envInstanceCount + 1;
		return newFMIComponent;
	}
}

// The master gets the level from the environment using this function
void environmentImpl_fmiGetInteger(struct fmiComponent *c,
		const fmiValueReference vr[env_integerArraySize], size_t nvr,
		fmiInteger value[env_integerArraySize]) {
	value[env_Level_environmentImpl_] = c->i[vr[env_Level_environmentImpl_]];

	printf("returned value f_Level_environmentImpl_... : %i\n",
			value[env_Level_environmentImpl_]);
}

// The master sets the pump on command from the controller using this
void environmentImpl_fmiSetBoolean(struct fmiComponent *c,
		const fmiValueReference vr[env_booleanArraySize], size_t nvr, fmiInteger value[env_booleanArraySize]) {
	c->b[vr[env_pumpOn_environmentImpl_]] = value[env_pumpOn_environmentImpl_];

	printf("set value fmi_pumpOn... : %i\n", value[env_pumpOn_environmentImpl_]);

}

// The simulation step
void environmentImpl_fmiDoStep() {
	environmentImpl_environSMstateMachine();
//	printf("fmiLevel:  %i\n", fmi_Level_environmentImpl);
//	printf("fmi_PumpOn:  %i\n", fmi_PumpOn_environmentImpl);
}
