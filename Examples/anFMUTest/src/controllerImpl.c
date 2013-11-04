#include "common.h"

myfmiComponent modelInstances[MaxFMUInstances]; // start of with an empty array of components
int conInstanceCount = 0;

fmiComponent fmiInstantiateSlave(fmiString instanceName, fmiString fmuGUID,
		fmiString fmuResourceLocation, const fmiCallbackFunctions* functions,
		fmiBoolean visible, fmiBoolean loggingOn) {
	// create a fmiComponent and allocate storage space
	myfmiComponent *c = malloc(sizeof(*c));
	if (!(conInstanceCount <= (MaxFMUInstances - 1))) {
		c->validInstance = fmiFalse;
		return (void**) c;
	} else {
		c->validInstance = fmiTrue;
		// set the name etc
		c->fmuInstanceName = instanceName;
		c->fmuGUID = fmuGUID;
		//add instance to collection;
		modelInstances[conInstanceCount] = *c;
		conInstanceCount = conInstanceCount + 1;
		return (void**) c;
	}
}

// Subroutines Generated from Events

fmiStatus setInteger(fmiComponent c, const fmiValueReference vr[], size_t nvr,
		fmiInteger value[]) {
// Translated code
	int idx = 0;
	myfmiComponent *mc = (void *) c;
	for (; idx < nvr; idx = idx + 1) {
		mc->i[vr[idx]] = value[vr[idx]];
	}
	return fmiOK;
}

fmiStatus fmiDoStep(fmiComponent c, fmiReal currentCommunicationPoint,
		fmiReal communicationStepSize,
		fmiBoolean noSetFMUStatePriorToCurrentPoint) {
// Translated code
	myfmiComponent *mc = (void *) c;
	mc->i[used_a_controllerImpl_] = ((mc->i[a_controllerImpl_]) / 2);
	printf(" used_a : %i\n ", (int) mc->i[used_a_controllerImpl_]);
	return fmiOK;
}

