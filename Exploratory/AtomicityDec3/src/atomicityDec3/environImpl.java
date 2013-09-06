package atomicityDec3;
// Task: environImpl

public class environImpl implements Runnable
{
	
	// Instance variables and constants
	protected int b;
	protected int priority = 5;
	
	public environImpl()
	{
	}
	
	public void run()
	{
		b = (b + 1);
		System.out.println("b: " + b);
	}
	
	// Subroutines
	public int getPriority()
	{
		return priority;
	}
	
}
