#ifndef ENVIRONIMPL_H
#define ENVIRONIMPL_H
fmiComponent *fmiInstantiateSlave(fmiString instanceName, fmiString fmuGUID,fmiString fmuResourceLocation, const fmiCallbackFunctions* functions,fmiBoolean visible, fmiBoolean loggingOn);
fmiStatus *fmiInitializeSlave(fmiComponent c,fmiReal relativeTolerance, fmiReal tStart,fmiBoolean stopTimeDefined, fmiReal tStop);
fmiStatus getInteger(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[]);
fmiStatus fmiDoStep(fmiComponent c, fmiReal currentCommunicationPoint, fmiReal communicationStepSize, fmiBoolean noSetFMUStatePriorToCurrentPoint);
#endif

