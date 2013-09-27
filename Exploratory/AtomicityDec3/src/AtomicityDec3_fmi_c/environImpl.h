#ifndef ENVIRONIMPL_H
#define ENVIRONIMPL_H
fmiStatus environImpl_SetInteger(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[]);
fmiStatus environImpl_fmiDoStep(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[]);
#endif

