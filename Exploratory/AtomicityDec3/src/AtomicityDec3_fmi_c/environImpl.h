#ifndef ENVIRONIMPL_H
#define ENVIRONIMPL_H
fmiStatus environImpl_GetInteger(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[]);
fmiStatus environImpl_fmiDoStep(fmiComponent c, fmiReal currentCommunicationPoint, fmiReal communicationStepSize, fmiBoolean noSetFMUStatePriorToCurrentPoint);
#endif

