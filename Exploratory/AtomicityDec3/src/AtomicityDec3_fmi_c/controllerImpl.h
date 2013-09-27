#ifndef CONTROLLERIMPL_H
#define CONTROLLERIMPL_H
fmiStatus controllerImpl_GetInteger(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[]);
fmiStatus controllerImpl_fmiDoStep(fmiComponent c, const fmiValueReference vr[], size_t nvr, fmiInteger value[]);
#endif

