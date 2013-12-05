#ifndef ENVIRONMENTIMPL_H
#define ENVIRONMENTIMPL_H
static fmiValueReference e_level_environmentImpl_ = 0;
static fmiValueReference e_pumpOnReq_environmentImpl_ = 0;
static fmiValueReference e_pumpOnCmd_environmentImpl_ = 1;
static fmiValueReference e_warn_environmentImpl_ = 2;
fmiComponent fmiInstantiateSlave(fmiString instanceName, fmiString fmuGUID,fmiString fmuResourceLocation, const fmiCallbackFunctions* functions,fmiBoolean visible, fmiBoolean loggingOn);
fmiStatus fmiInitializeSlave(fmiComponent c,fmiReal relativeTolerance, fmiReal tStart,fmiBoolean stopTimeDefined, fmiReal tStop);
fmiStatus fmiSetInteger(fmiComponent c, const fmiValueReference vr[], size_t nvr, const fmiInteger value[]);
fmiStatus fmiGetBoolean(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[]);
fmiStatus fmiGetInteger(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[]);
fmiStatus fmiDoStep(fmiComponent c, fmiReal currentCommunicationPoint, fmiReal communicationStepSize, fmiBoolean noSetFMUStatePriorToCurrentPoint);
#endif

