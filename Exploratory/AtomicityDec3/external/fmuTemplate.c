#include "config.h"
#include "fakeFMIDecls.h"

#include <stdio.h>
#include <stdlib.h>

fmiComponent *modelInstances[MaxFMUInstances]; // start of with an empty array of components
int conInstanceCount = 0;

// Subroutines

//## <subroutineList>

// a minimal constructor
fmiComponent *fmiInstantiateControllerImpl(fmiString instanceName,
		fmiString GUID) {
	// create a fmiComponent and allocate storage space
	fmiComponent *newFMIComponent = malloc(sizeof(*newFMIComponent));
	if (!(conInstanceCount <= (MaxFMUInstances - 1))) {
		newFMIComponent->validInstance = fmiFalse;
		return newFMIComponent;
	} else {
		newFMIComponent->validInstance = fmiTrue;
		// set the name etc
		newFMIComponent->fmuInstanceName = instanceName;
		newFMIComponent->fmuGUID = GUID;

		//## <initialisationsList>

		//## <stateMachineProgramCounterIni>
		//add instance to collection;
		modelInstances[conInstanceCount] = newFMIComponent;
		conInstanceCount = conInstanceCount + 1;
		return newFMIComponent;
	}
}

//## OptionalBlock(getBooleanList.size() > 0)
void /*##<fmuMachineName>*/_fmiGetBoolean(fmiComponent *c,
		const fmiValueReference vr[booleanArraySize], size_t nvr,
		fmiBoolean value[booleanArraySize]) {
		//##<getBooleanList>
}
//## EndOptional

//## OptionalBlock(setBooleanList.size() > 0)
void /*##<fmuMachineName>*/_fmiSetBoolean(fmiComponent *c,
		const fmiValueReference vr[booleanArraySize], size_t nvr,
		fmiBoolean value[booleanArraySize]) {
		//##<setBooleanList>
}
//## EndOptional

//## OptionalBlock(getIntegerList.size() > 0)
void /*##<fmuMachineName>*/_fmiGetInteger(fmiComponent *c,
		const fmiValueReference vr[integerArraySize], size_t nvr,
		fmiInteger value[integerArraySize]) {
		//## <getIntegerList>
}
//## EndOptional

//## OptionalBlock(setIntegerList.size() > 0)
void /*##<fmuMachineName>*/_fmiSetInteger(fmiComponent *c,
		const fmiValueReference vr[integerArraySize], size_t nvr,
		fmiInteger value[integerArraySize]) {
		//## <setIntegerList>
}
//## EndOptional

//## OptionalBlock(getRealList.size() > 0)
void /*##<fmuMachineName>*/_fmiGetReal(fmiComponent *c,
		const fmiValueReference vr[realArraySize], size_t nvr,
		fmiReal value[realArraySize]) {
		//##<getRealList>
}
//## EndOptional

//## OptionalBlock(setRealList.size() > 0)
void /*##<fmuMachineName>*/_fmiSetReal(fmiComponent *c,
		const fmiValueReference vr[realArraySize], size_t nvr,
		fmiReal value[realArraySize]) {
		//##<setRealList>
}
//## EndOptional

//## OptionalBlock(getStringList.size() > 0)
void /*##<fmuMachineName>*/_fmiGetString(fmiComponent *c,
		const fmiValueReference vr[stringArraySize], size_t nvr,
		fmiString value[stringArraySize]) {
		//##<getStringList>
}
//## EndOptional

//## OptionalBlock(setStringList.size() > 0)
void /*##<fmuMachineName>*/_fmiSetString(fmiComponent *c,
		const fmiValueReference vr[stringArraySize], size_t nvr,
		fmiString value[stringArraySize]) {
		//##<setStringList>
}
//## EndOptional

// the simulation step.
void /*##<fmuMachineName>*/_fmiDoStep(fmiComponent *c) {
	// Translated code
	//##<doStepList>
}
