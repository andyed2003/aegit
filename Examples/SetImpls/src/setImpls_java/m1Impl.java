package setImpls_java;

// Task: m1Impl

public class m1Impl implements Runnable {

	// Instance variables and constants
	protected SetImpl<Integer> mySet = new SetImpl<Integer>();
	protected SetImpl<Integer> otherSet = new SetImpl<Integer>();
	protected int priority = 5;

	public m1Impl() {
		mySet.add(1);
		mySet.add(2);
		otherSet.add(2);
		otherSet.add(3);
	}

	public void run() {
		mySet = mySet.union(otherSet);
		mySet = mySet.setIntersect(otherSet);
	}

	// Subroutines
	public int getPriority() {
		return priority;
	}

}
