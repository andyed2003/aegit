#include "Common.h"
// Task: m1Impl

// Variables and constants
setOf'int mySet_m1Impl = create(int);
setOf'int otherSet_m1Impl = create(int);
int element_m1Impl = create(int, 0);
setOf'AltType altTypeSet_m1Impl = create(AltType);
AltType res1_m1Impl = create(AltType);
AltType res2_m1Impl = create(AltType);
HashMapImpl(AltType, AltType) func_m1Impl = createHashMapImpl(AltType,AltType);
const int priority_m1Impl = 5;


// Subroutines
void m1Impl()
{
	mySet_m1Impl = intersect(mySet_m1Impl, otherSet_m1Impl);
	mySet_m1Impl = union(mySet_m1Impl,otherSet_m1Impl);
	mySet_m1Impl = subtract(mySet_m1Impl, otherSet_m1Impl);
	element_m1Impl :∈ getFirst(mySet_m1Impl);
	mySet_m1Impl = (setUnion(mySet_m1Impl, element_m1Impl));
	altTypeSet_m1Impl = (setUnion(altTypeSet_m1Impl, res1_m1Impl));
	func_m1Impl = put2(func_m1Impl,alt_1,alt_2);
	res1_m1Impl = get(func_m1Impl,alt_1);
}
