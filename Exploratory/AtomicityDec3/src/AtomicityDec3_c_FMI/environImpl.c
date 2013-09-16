#include "Common.h"
// Protected: environImpl

// Variables and constants
int b_environImpl = 99;


// Subroutines
void environImpl_env_fmiDoStep()
{
// [Internal] This will block until the guard has been met (no nice way of doing this in OpenMP 2.5)
BOOL completed = FALSE; 	 // [Internal] Private to the thread by default
// [Internal] Try and get lock
// Translated code
b_environImpl = (b_environImpl + 1);
// [Internal] Set completed flag
completed = TRUE;
}

void environImpl_fmiGetInteger(int *p)
{
// [Internal] This will block until the guard has been met (no nice way of doing this in OpenMP 2.5)
BOOL completed = FALSE; 	 // [Internal] Private to the thread by default
// [Internal] Try and get lock
// Translated code
(*p)= b_environImpl ;
// [Internal] Set completed flag
completed = TRUE;
}

