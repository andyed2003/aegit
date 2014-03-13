package setImpls_java;

// Task: m1Impl

public class m1Impl implements Runnable {

	// Instance variables and constants
	protected SetImpl<Integer> mySet = new SetImpl<Integer>();
	protected SetImpl<Integer> otherSet = new SetImpl<Integer>();
	protected Integer element = 0;
	protected int priority = 5;

	public m1Impl() {
	}

	public void run() {
		mySet = mySet.intersect(otherSet);
		mySet = mySet.union(otherSet);
		mySet = mySet.subtract(otherSet);
		element = mySet.getFirst();
		mySet = (mySet.setUnion(element));
	}

	// Subroutines
	public int getPriority() {
		return priority;
	}

}
