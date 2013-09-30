#include "Common.h"
// Protected: environImpl

// Variables and constants
int b_environImpl = 99;
BOOL tmp_environImpl = TRUE;


// Subroutines
fmiStatus environImpl_GetInteger(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[])
{
// Translated code
}

fmiStatus environImpl_fmiDoStep(fmiComponent c, fmiReal currentCommunicationPoint, fmiReal communicationStepSize, fmiBoolean noSetFMUStatePriorToCurrentPoint)
{
// Translated code
b_environImpl = (b_environImpl + 1);
printf("b:  %i\n", b_environImpl);
}

