#include "Common.h"
// Protected: environImpl

// Variables and constants
int b_environImpl = 99;


// Subroutines
fmiStatus environImpl_SetInteger(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[])
{
// Translated code
}

fmiStatus environImpl_fmiDoStep(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[])
{
// Translated code
b_environImpl = (b_environImpl + 1);
printf("b:  %i\n", b_environImpl);
}

