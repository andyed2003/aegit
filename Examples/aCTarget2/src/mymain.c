/*
 * mymain.c
 *
 *  Created on: 13 Nov 2013
 *      Author: andy
 */

#include <stdio.h>
#include "fmiFunctions.h"

int main(int argc, char **argv) {

	printf("Hello1 \n");

	printf("Hello2\n");

	printf("Goodbye\n");

	fmiCallbackFunctions *f;

	fmiInstantiateSlave("a","b","",f,fmiFalse, fmiFalse);

	return 0;
}
