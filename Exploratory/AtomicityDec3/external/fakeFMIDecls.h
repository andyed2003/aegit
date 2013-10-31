/*
 * fakeFMIDecls.h
 *
 *  Created on: 29 Jul 2013
 *      Author: andy
 */
#include "config.h"

#ifndef FAKEFMIDECLS_H_
#define FAKEFMIDECLS_H_

typedef unsigned int fmiValueReference;
typedef double       fmiReal   ;
typedef int          fmiInteger;
typedef char         fmiBoolean;
typedef const char*  fmiString ;

typedef enum {
	fmiOK, fmiWarning, fmiDiscard, fmiError, fmiFatal, fmiPending
} fmiStatus;

/* Values for fmiBoolean  */
#define fmiTrue  1
#define fmiFalse 0

/* Undefined value for fmiValueReference (largest unsigned int value) */
#define fmiUndefinedValueReference (fmiValueReference)(-1)

// my fmiComponent
typedef struct{
	fmiBoolean validInstance;
	fmiString fmuInstanceName;
	fmiString fmuGUID;
	fmiValueReference i[integerArraySize]; // my fake fmi: array of fmiValueReferences to integers
	fmiValueReference b[booleanArraySize]; // my fake fmi: array of fmiValueReferences to booleans
	fmiValueReference r[realArraySize]; // my fake fmi: array of fmiValueReferences to real
	fmiValueReference s[stringArraySize]; // my fake fmi: array of fmiValueReferences to strings
} fmiComponent;

typedef struct{

} fmiCallbackFunctions;


#endif /* FAKEFMIDECLS_H_ */
