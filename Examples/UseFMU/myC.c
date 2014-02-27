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
	// declare a pointer to the fmiFunction
	char* (*fptr)();
	// get the function pointer
	*(void **)(&fptr) = dlsym(lib_handle, "fmiGetTypesPlatform");
	// declare a pointer to the return type
	const char* ret;
	// call the function and collect the return value
	ret = (*fptr)();
	//<<<<<<<< End of: Get the types paltform




	const char* error_msg;
	error_msg = dlerror();
	if (error_msg) {
	    fprintf(stderr, "Error locating 'fmiGetTypesPlatform' - %s\n", error_msg);
	    exit(1);
	}

	dlclose(lib_handle);
	return 1;
}
