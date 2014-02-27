#include<stdio.h>
#include<dlfcn.h>


int main(int argc, char **argv) {
	printf("hello");

	void* lib_handle;

	lib_handle = dlopen("/home/andy/git/aegit/Examples/TestFMUPumpC/Debug/libTestFMUPumpC.so", 1 );
	if (!lib_handle) {
	    fprintf(stderr, "Error during dlopen(): %s\n", dlerror());
	    exit(1);
	}
	char * typesP;
	typesP = dlsym(lib_handle, "fmiGetTypesPlatform");

	const char* error_msg;
	error_msg = dlerror();
	if (error_msg) {
	    fprintf(stderr, "Error locating 'fmiGetTypesPlatform' - %s\n", error_msg);
	    exit(1);
	}

	return 1;
}
