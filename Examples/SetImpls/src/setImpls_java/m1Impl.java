package setImpls_java;

import java.util.Set;

// Task: m1Impl

public class m1Impl implements Runnable {

	// Instance variables and constants
	protected SetImpl<Integer> mySet = new SetImpl<Integer>();
	protected SetImpl<Integer> otherSet = new SetImpl<Integer>();
	protected int priority = 5;

	public m1Impl() {
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		otherSet.add(3);
		otherSet.add(4);
	}

	public void run() {
		SetImpl<Integer> origSet = (SetImpl<Integer>) mySet.clone();
		mySet = mySet.intersect(otherSet);
		mySet = mySet.union(otherSet);
		mySet = mySet.subtract(origSet);
	}

	// Subroutines
	public int getPriority() {
		return priority;
	}

}
