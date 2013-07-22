// MainEntry: MainEntry
#include "Common.h"
// Global defns
int main (int argc, char *argv[])
{
	#pragma omp parallel sections
	{
		#pragma omp section
		{
			controllerImpl();
		}
		#pragma omp section
		{
			environmentImpl();
		}
	}
}

