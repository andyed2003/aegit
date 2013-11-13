/*
 * mymain.c
 *
 *  Created on: 13 Nov 2013
 *      Author: andy
 */

#include <stdio.h>
#include "fmiFunctions.h"

int main(int argc, char **argv) {

	fmiReal tolerance = 0.1;
	fmiReal start = 0;
	fmiReal end = 1;
	fmiCallbackFunctions *f;
	fmiComponent comp;
	comp = fmiInstantiateSlave("a","b","",f,fmiFalse, fmiFalse);
	fmiInitializeSlave(comp,tolerance,start,fmiTrue,end);
	int idx = 0;
	for(; idx < 10; idx = idx + 1){
		fmiDoStep(comp,start,end,fmiTrue);
	}
	return 0;
}
