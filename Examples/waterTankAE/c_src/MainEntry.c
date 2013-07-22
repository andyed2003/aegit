// MainEntry: MainEntry
#include "Common.h"
// Global defns
int main (int argc, char *argv[])
{
	#pragma omp parallel sections
	{
		#pragma omp section
		{
			controller_fmiDoStep();
		}
		#pragma omp section
		{
			environmentImpl_fmiDoStep();
		}
	}
}

