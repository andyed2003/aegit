#include "Common.h"
// Protected: environImpl

// Variables and constants
int b_environImpl = 99;


// Subroutines
void environImpl_fmiGetInteger(int *b)
{
// Translated code
}

void environImpl_fmiDoStep()
{
// Translated code
b_environImpl = (b_environImpl + 1);
printf("b:  %i\n", b_environImpl);
}

