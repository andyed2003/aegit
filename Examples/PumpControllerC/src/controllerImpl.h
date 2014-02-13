#ifndef CONTROLLERIMPL_H
#define CONTROLLERIMPL_H
static fmiValueReference c_level_controllerImpl_ = 0;
static fmiValueReference c_pumpOnReq_controllerImpl_ = 0;
static fmiValueReference c_pumpOnCmd_controllerImpl_ = 1;
static fmiValueReference c_warn_controllerImpl_ = 2;
static fmiValueReference c_level_internal_controllerImpl_ = 1;
static fmiValueReference c_pumpOnReq_internal_controllerImpl_ = 3;
fmiComponent fmiInstantiateSlave(fmiString instanceName, fmiString fmuGUID,
		fmiString fmuResourceLocation, const fmiCallbackFunctions* functions,
		fmiBoolean visible, fmiBoolean loggingOn);
fmiStatus fmiInitializeSlave(fmiComponent c, fmiReal relativeTolerance,
		fmiReal tStart, fmiBoolean stopTimeDefined, fmiReal tStop);
fmiStatus fmiSetInteger(fmiComponent c, const fmiValueReference vr[],
		size_t nvr, const fmiInteger value[]);
fmiStatus fmiSetBoolean(fmiComponent c, const fmiValueReference vr[],
		size_t nvr, const fmiInteger value[]);
fmiStatus fmiGetBoolean(fmiComponent c, const fmiValueReference vr[],
		size_t nvr, fmiInteger value[]);
fmiStatus fmiDoStep(fmiComponent c, fmiReal currentCommunicationPoint,
		fmiReal communicationStepSize,
		fmiBoolean noSetFMUStatePriorToCurrentPoint);
#endif

