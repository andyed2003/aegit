package setImpls_java;
// Task: m1Impl

public class m1Impl implements Runnable
{
	
	// Instance variables and constants
	protected Set<Integer> mySet = newSet(∅);
	protected Set<Integer> otherSet = newSet(∅);
	protected int priority = 5;
	
	public m1Impl()
	{
	}
	
	public void run()
	{
		mySet = setUnion(mySet,otherSet);
		mySet = setIntersection(mySet,otherSet);
	}
	
	// Subroutines
	public int getPriority()
	{
		return priority;
	}
	
}
