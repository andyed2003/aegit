/*
 * fakeFMIDecls.h
 *
 *  Created on: 29 Jul 2013
 *      Author: andy
 */

#ifndef FAKEFMIDECLS_H_
#define FAKEFMIDECLS_H_

typedef void*        fmiComponent;
typedef unsigned int fmiValueReference;
typedef double       fmiReal   ;
typedef int          fmiInteger;
typedef char         fmiBoolean;
typedef const char*  fmiString ;

/* Values for fmiBoolean  */
#define fmiTrue  1
#define fmiFalse 0

/* Undefined value for fmiValueReference (largest unsigned int value) */
#define fmiUndefinedValueReference (fmiValueReference)(-1)

#define fmiUndefinedFMIComponent (fmiComponent) (-1)

struct fmiComponent{
	fmiString fmuInstanceName;
	fmiString fmuGUID;
	fmiValueReference i[10]; // my fake fmi: array of fmiValueReferences to integers
	fmiValueReference b[10]; // my fake fmi: array of fmiValueReferences to booleans
} ;

#endif /* FAKEFMIDECLS_H_ */
