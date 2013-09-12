// Variables and constants
int a_controllerImpl = 0;
int used_a_controllerImpl = 0;

// Subroutines
void controllerImpl_controller_fmiDoStep() {
// [Internal] This will block until the guard has been met (no nice way of doing this in OpenMP 2.5)
	BOOL completed = FALSE; // [Internal] Private to the thread by default
// [Internal] Try and get lock
#pragma omp critical (CONTROLLERIMPL)
	{
// Translated code
		used_a_controllerImpl = ((a_controllerImpl) / 2);
// [Internal] Set completed flag
		completed = TRUE;
	}
}

void controllerImpl_fmiSetInteger(int p) {
// [Internal] This will block until the guard has been met (no nice way of doing this in OpenMP 2.5)
	BOOL completed = FALSE; // [Internal] Private to the thread by default
// [Internal] Try and get lock
#pragma omp critical (CONTROLLERIMPL)
	{
// Translated code
		a_controllerImpl = p;
// [Internal] Set completed flag
		completed = TRUE;
	}
}

