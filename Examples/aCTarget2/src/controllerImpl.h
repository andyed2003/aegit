#ifndef CONTROLLERIMPL_H
#define CONTROLLERIMPL_H
static fmiValueReference a_controllerImpl_ = 0;
static fmiValueReference used_a_controllerImpl_ = 1;
fmiComponent fmiInstantiateSlave(fmiString instanceName, fmiString fmuGUID,fmiString fmuResourceLocation, const fmiCallbackFunctions* functions,fmiBoolean visible, fmiBoolean loggingOn);
fmiStatus fmiInitializeSlave(fmiComponent c,fmiReal relativeTolerance, fmiReal tStart,fmiBoolean stopTimeDefined, fmiReal tStop);
fmiStatus fmiSetInteger(fmiComponent c, const fmiValueReference vr[], size_t nvr, const fmiInteger value[]);
fmiStatus fmiDoStep(fmiComponent c, fmiReal currentCommunicationPoint, fmiReal communicationStepSize, fmiBoolean noSetFMUStatePriorToCurrentPoint);
#endif

