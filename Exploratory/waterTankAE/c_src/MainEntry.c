// MainEntry: MainEntry
#include "Common.h"
#include "controllerImpl.h"
#include "environmentImpl.h"
#include "fakeFMIDecls.h"
// Global defns
int main(int argc, char *argv[]) {
	int *masterCopyOf_fmi_Level;
	BOOL *masterCopyOf_c_PumpOn;

	fmiString name = "controllerImpl";
	fmiString guid = "007";
	fmiComponent *f = fmiInstantiateControllerImpl(name, guid);

	if((int *)f == (fmiUndefinedFMIComponent)){
		printf("Too many FMU's \n");
		return -1;
	}


	// I am the master! Tell me about your variables 0-0`
	int i = 0;
	for (i = 0; i < 100; i = i + 1) {
		controller_fmiDoStep();
		environmentImpl_fmiDoStep();

		// update master:
		// get integer fmi_Level from environment
		environmentImpl_fmiGetInteger(&masterCopyOf_fmi_Level);
		// update master:
		// get Boolean c_PumpOn from controller
		controller_fmiGetBoolean(&masterCopyOf_c_PumpOn);
		// update controller:
		// set c_Level to fmi_Level from environment
		controller_fmiSetInteger(&masterCopyOf_fmi_Level);
		// update environment:
		// set fmi_PumpOn to c_PumpOn from controller
		environmentImpl_fmiSetBoolean(&masterCopyOf_c_PumpOn);
	}
	return 0;
}

