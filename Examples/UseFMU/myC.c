#include<stdio.h>
#include<dlfcn.h>
#include"fmiTypesPlatform.h"
#include"fmiFunctionTypes.h"
#include"fmiFunctions.h"
#include "myFMIDecls.h"

int main(int argc, char **argv) {
	printf("hello");

	void* lib_handle;

	lib_handle = dlopen("/home/andy/git/aegit/Examples/TestFMUPumpC/Debug/libTestFMUPumpC.so", 1 );
	if (!lib_handle) {
	    fprintf(stderr, "Error during dlopen(): %s\n", dlerror());
	    exit(1);
	}

	//>>>>>>> Get the types platform
	// declare a pointer to the fmiGetTypesPlatform function
	char* (*getfmiTypesPlatform)();
	// get the function pointer
	*(void **)(&getfmiTypesPlatform) = dlsym(lib_handle, "fmiGetTypesPlatform");
	// declare a pointer to the return type
	const char* ret;
	// call the function and collect the return value
	ret = (*getfmiTypesPlatform)();
	//<<<<<<<< End of: Get the types platform


//	fmiComponent fmiInstantiateSlave(fmiString instanceName, fmiString fmuGUID,
//			fmiString fmuResourceLocation, const fmiCallbackFunctions* functions,
//			fmiBoolean visible, fmiBoolean loggingOn)

	// declare a pointer to the fmiInstantiateSlave function
	fmi_Component* (*fmiInstantiateSlave)(fmiString, fmiString, fmiString, const fmiCallbackFunctions*, fmiBoolean, fmiBoolean );
//	// get the function pointer
	*(void **)(&fmiInstantiateSlave) = dlsym(lib_handle, "fmiInstantiateSlave");
	fmi_Component * ret2;
	fmiString instanceName = "thisName";
	fmiString fmuGUID = "thisGUID";
	fmiString fmuResourceLocation = "somewhere";
	fmiCallbackFunctions* functions;
	fmiBoolean visible = fmiTrue;
	fmiBoolean loggingOn = fmiFalse;
	ret2 = (*fmiInstantiateSlave) (instanceName, fmuGUID, fmuResourceLocation, functions, visible, loggingOn);


	const char* error_msg;
	error_msg = dlerror();
	if (error_msg) {
	    fprintf(stderr, "Error locating 'fmiGetTypesPlatform' - %s\n", error_msg);
	    exit(1);
	}

	dlclose(lib_handle);
	return 1;
}
