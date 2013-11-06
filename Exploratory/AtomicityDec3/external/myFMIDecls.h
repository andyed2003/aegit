/*
 * myFMIDecls.h
 *
 *  Created on: 29 Jul 2013
 *      Author: andy
 */
#include "config.h"

#ifndef myFMIDECLS_H_
#define myFMIDECLS_H_


// my fmiComponent
typedef struct{
	fmiBoolean validInstance;
	fmiString fmuInstanceName;
	fmiString fmuGUID;
	fmiValueReference i[integerArraySize]; // my array of fmiValueReferences to integers
	fmiValueReference b[booleanArraySize]; // my array of fmiValueReferences to booleans
	fmiValueReference r[realArraySize]; // my array of fmiValueReferences to real
	fmiValueReference s[stringArraySize]; // my array of fmiValueReferences to strings
} myfmiComponent;


#endif /* myFMIDECLS_H_ */
