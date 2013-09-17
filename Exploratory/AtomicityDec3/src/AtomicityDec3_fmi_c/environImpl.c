#include "Common.h"
// Protected: environImpl

// Variables and constants
int b_environImpl = 99;


// Subroutines
void environImpl_env_fmiDoStep()
{
// Translated code
b_environImpl = (b_environImpl + 1);
}

void environImpl_fmiGetInteger(int *p)
{
// Translated code
(*p)= b_environImpl ;
}

