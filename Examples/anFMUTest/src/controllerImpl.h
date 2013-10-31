#ifndef CONTROLLERIMPL_H
#define CONTROLLERIMPL_H
fmiComponent *fmiInstantiateSlave(fmiString instanceName, fmiString fmuGUID,fmiString fmuResourceLocation, const fmiCallbackFunctions* functions,fmiBoolean visible, fmiBoolean loggingOn);
fmiStatus *fmiInitializeSlave(fmiComponent c,fmiReal relativeTolerance, fmiReal tStart,fmiBoolean stopTimeDefined, fmiReal tStop);
fmiStatus setInteger(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[]);
fmiStatus fmiDoStep(fmiComponent c, fmiReal currentCommunicationPoint, fmiReal communicationStepSize, fmiBoolean noSetFMUStatePriorToCurrentPoint);
#endif

