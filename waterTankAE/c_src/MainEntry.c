// MainEntry: MainEntry
#include "Common.h"
// Global defns
int main(int argc, char *argv[]) {
	int *masterCopyOf_fmi_Level;
	BOOL masterCopyOf_c_PumpOn;

	// I am the master! Tell me about your variables

	for (int i = 0; i < 100; i = i + 1) {
		controller_fmiDoStep();
		environmentImpl_fmiDoStep();
		// update master
		environmentImpl_getInteger(masterCopyOf_fmi_Level);
		cont

		environmentImpl_writePump(masterCopyOf_c_PumpOn);
	}
}

