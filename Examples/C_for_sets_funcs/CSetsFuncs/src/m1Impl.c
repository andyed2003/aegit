#include "Common.h"
// Task: m1Impl

#define setSize 5

// Variables and constants
typedef void* setOf_int;
typedef void* setOf_AltType;
typedef void* HashMapImpl;


void create_setOf_int(void* newSet){
	// create a newset of int
	// assign it to newSet
	return;
}

void create_int(void* newint){
	// create a new int
	// assign it to newInt
	return;
}

void create_setOf_AltType(void *altTypeSet_m1Impl){
	// create a new set of AltType
	// assign it to altTypeSet_m1Impl
	return;
}

void create_HashMapImpl(void* AltType){
	// create a new hashmap of AltType * AltType
	// assign the new hashmap to AltType
	return;
}

setOf_int mySet_m1Impl;
setOf_int otherSet_m1Impl;
int* element_m1Impl;
setOf_AltType altTypeSet_m1Impl;
AltType* res1_m1Impl;
AltType res2_m1Impl;
HashMapImpl func_m1Impl;


void createStorage(){
create_setOf_int(&mySet_m1Impl);
create_setOf_int(&otherSet_m1Impl);
create_int(&element_m1Impl);
create_setOf_AltType(&altTypeSet_m1Impl);
create_HashMapImpl(&res1_m1Impl);
create_HashMapImpl(&res1_m1Impl);
}


setOf_int intersect(setOf_int a, setOf_int b){
	// return intersection c = a/b
	setOf_int c = malloc(setSize*sizeof(int));
	return c;
}

setOf_int union_(setOf_int a, setOf_int b){
	// return union c = a\/b
	setOf_int c = malloc(setSize*sizeof(int));
	return c;
}

setOf_int setUnion(setOf_int a, int* b){
	// return union c = a\/{b}
	setOf_int c = malloc(setSize*sizeof(int));
	return c;
}

setOf_AltType setUnionAltType(setOf_AltType a, AltType* b){
	// return union c = a\/{b}
	setOf_int c = malloc(setSize*sizeof(int));
	return c;
}


setOf_int subtract(setOf_int a, setOf_int b){
	// return subtraction c = a\/b
	setOf_int c = malloc(setSize*sizeof(int));
	return c;
}

int* getFirst(setOf_int mySet_m1Impl){
	// return the first element of mySet_m1Impl
	int* n = 0;
	return n;
}

HashMapImpl put2(func_m1Impl,alt_1,alt_2){
	//put {alt |-> alt 2} in func_m1Impl
	// and return
	HashMapImpl newHashMap = malloc(setSize*sizeof(int));
	return newHashMap;
}

AltType* get(HashMapImpl a, AltType b){
	// get a(b) and return
	AltType* c = malloc(setSize*sizeof(int));
	return c;
}

// Subroutines
void m1Impl()
{
	createStorage();
	mySet_m1Impl = intersect(mySet_m1Impl, otherSet_m1Impl);
	mySet_m1Impl = union_(mySet_m1Impl,otherSet_m1Impl);
	mySet_m1Impl = subtract(mySet_m1Impl, otherSet_m1Impl);
	element_m1Impl = getFirst(mySet_m1Impl);
	mySet_m1Impl = (setUnion(mySet_m1Impl, element_m1Impl));
	altTypeSet_m1Impl = (setUnionAltType(altTypeSet_m1Impl, res1_m1Impl));
	func_m1Impl = put2(func_m1Impl,alt_1,alt_2);
	res1_m1Impl = get(func_m1Impl,alt_1);
}


