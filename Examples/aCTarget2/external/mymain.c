/*
 * mymain.c
 *
 *  Created on: 13 Nov 2013
 *      Author: andy
 */

#include <stdio.h>
#include "config.h"
#include "fmiFunctions.h"


int main(int argc, char **argv) {

	fmiReal tolerance = 0.1;
	fmiReal start = 0;
	fmiReal end = 1;
	fmiCallbackFunctions *f;
	fmiComponent comp;
	fmiValueReference tmp[NUMBER_OF_INTEGERS] = {0};
	fmiInteger vals[NUMBER_OF_INTEGERS]={0};
	comp = fmiInstantiateSlave("a","b","",f,fmiFalse, fmiFalse);
	fmiInitializeSlave(comp,tolerance,start,fmiTrue,end);
	int idx = 100;
	for(; idx < 1000; idx = idx + 100){
		vals[0] = idx;
		fmiSetInteger(comp, tmp, NUMBER_OF_INTEGERS, vals );
		fmiDoStep(comp,start,end,fmiTrue);
	}
	return 0;
}
