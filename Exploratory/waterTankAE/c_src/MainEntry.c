// MainEntry: MainEntry
#include "Common.h"
#include "controllerImpl.h"
#include "environmentImpl.h"
#include "fakeFMIDecls.h"
// Global defns
int main(int argc, char *argv[]) {
	fmiString c_name = "controllerImpl";
	fmiString c_guid = "007";
	fmiString env_name = "envronmentImpl";
	fmiString env_guid = "008";

	fmiInteger c_time = 0;

	struct fmiComponent* f = fmiInstantiateControllerImpl(c_name, c_guid);
	struct fmiComponent* g = fmiInstantiateEnvironmentImplImpl(env_name, env_guid);

	if(f->validInstance == fmiFalse){
		printf("Too many FMU's: %s \n", f->fmuInstanceName);
		return -1;
	}

	if(g->validInstance == fmiFalse){
		printf("Too many FMU's: %s \n", g->fmuInstanceName);
		return -1;
	}



	// master getting/receiving values from the environment FMU
	fmiValueReference envIntegerValuesToGet[env_integerArraySize] = {env_Level_environmentImpl_};
	fmiInteger envRecievedIntegerValues[env_integerArraySize];

	// master getting/receiving from the controller FMU
	fmiValueReference conBooleanValuesToGet[c_booleanArraySize] = {c_pumpOn_controllerImpl_};
	fmiBoolean conRecievedBooleanValues[c_booleanArraySize];

	// master sending values to bot FMUs
	fmiInteger conIntegerValuesToSet[c_integerArraySize] = {c_Level_controllerImpl_, c_time_controllerImpl_};
	fmiBoolean envBooleanValuesToSet[env_booleanArraySize] = {env_pumpOn_environmentImpl_};

	// I am the master! Tell me about your variables 0-0`
	int i = 0;
	for (i = 0; i < 100; i = i + 1) {

		conIntegerValuesToSet[c_time_controllerImpl_] = c_time;
		c_time =  c_time + 1;

		controller_fmiDoStep(f);
		environmentImpl_fmiDoStep();

		printf("getting env int ref1: %i\n", envIntegerValuesToGet[0]);

		// update master:
		// get integer fmi_Level from environment
		environmentImpl_fmiGetInteger(f, envIntegerValuesToGet, sizeof(envIntegerValuesToGet), envRecievedIntegerValues);

		// The envRecievedIntegers have to have the time added. So we manually
		// transfer data to conIntegersValuesToSet, adding the additional time vale that we require
		// as we proceed through the loop below
		conIntegerValuesToSet[c_Level_controllerImpl_] = envRecievedIntegerValues[env_Level_environmentImpl_];

		// update master:
		// get Boolean c_PumpOn from controller
		printf("getting bool ref: %i\n", conBooleanValuesToGet[0]);
		controller_fmiGetBoolean(f, conBooleanValuesToGet, sizeof(conBooleanValuesToGet) ,conRecievedBooleanValues);

		// update controller:
		// set c_Level to fmi_Level from environment, and time from master
		controller_fmiSetInteger(f, conIntegerValuesToSet, sizeof(conIntegerValuesToSet), conIntegerValuesToSet );

		// update environment:
		// set fmi_PumpOn to c_PumpOn from controller
		environmentImpl_fmiSetBoolean(f, envBooleanValuesToSet, sizeof(envBooleanValuesToSet), conRecievedBooleanValues );
	}
	return 0;
}

