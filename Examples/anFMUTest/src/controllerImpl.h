#ifndef CONTROLLERIMPL_H
#define CONTROLLERIMPL_H
fmiValueReference a_controllerImpl_ = 0;
fmiValueReference used_a_controllerImpl_ = 1;
//fmiComponent *fmiInstantiateSlave(fmiString instanceName, fmiString fmuGUID,fmiString fmuResourceLocation, const fmiCallbackFunctions* functions,fmiBoolean visible, fmiBoolean loggingOn);
fmiStatus setInteger(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[]);
fmiStatus fmiDoStep(fmiComponent c, fmiReal currentCommunicationPoint, fmiReal communicationStepSize, fmiBoolean noSetFMUStatePriorToCurrentPoint);
#endif

