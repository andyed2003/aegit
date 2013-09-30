#include "Common.h"
// Protected: controllerImpl

// Variables and constants
int a_controllerImpl = 0;
int used_a_controllerImpl = 0;


// Subroutines
fmiStatus controllerImpl_GetInteger(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[])
{
// Translated code
a_controllerImpl = p;
}

fmiStatus controllerImpl_fmiDoStep(fmiComponent c, fmiReal currentCommunicationPoint, fmiReal communicationStepSize, fmiBoolean noSetFMUStatePriorToCurrentPoint)
{
// Translated code
used_a_controllerImpl = ((a_controllerImpl) / 2);
printf("used_a:  %i\n", used_a_controllerImpl);
}

