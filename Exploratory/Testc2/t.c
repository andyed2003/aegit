/*
 * t.c
 *
 *  Created on: 11 Sep 2013
 *      Author: andy
 */
#include <stdio.h>

int a = 909;
int* a1 = &a;

int b = 99;
int c = 101;

void op(int* p1, int* p2){
	printf("p1: %x\n", p1);
	printf("p2: %x\n", p2);
	*p1 = b;
	*p2 = c;
}

int main(int argc, char **argv) {

	printf("a: %x\n", &a);
	printf("a1: %x\n", a1);
	printf("a1_value: %i\n", *a1);
	op( &a, a1 );
	printf("after: a = %i\n ", a);
	printf("after: a1 = %i\n ", *a1);
	return 0;
}


