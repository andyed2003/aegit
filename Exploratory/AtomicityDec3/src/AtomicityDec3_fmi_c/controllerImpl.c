#include "Common.h"
// Protected: controllerImpl

// Variables and constants
int a_controllerImpl = 0;
int used_a_controllerImpl = 0;


// Subroutines
void controllerImpl_fmiSetInteger(int p)
{
// Translated code
a_controllerImpl = p;
}

void controllerImpl_fmiDoStep()
{
// Translated code
used_a_controllerImpl = ((a_controllerImpl) / 2);
printf("used_a:  %i\n", used_a_controllerImpl);
}

