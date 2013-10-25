package atomicityDec3_java;
// Protected: environImpl

public class environImpl
{
	
	// Instance variables and constants
	protected static int b = 99;
	protected static boolean tmp = true;
	private static Object lock = new Object();
	
	public environImpl()
	{
		
	}
	
	// Subroutines
	public void fmiGetInteger(Pointer<Integer> b)
	{
		// [Internal] This will block until the guard has been met
		boolean completed = false; 	 // private to the thread by default
		// [Internal] Try and get lock
		synchronized(lock)
		{
			// Translated code
			// [Internal] Set completed flag
			completed = true;
		}
	}
	
	public void env_fmiDoStep()
	{
		// [Internal] This will block until the guard has been met
		boolean completed = false; 	 // private to the thread by default
		// [Internal] Try and get lock
		synchronized(lock)
		{
			// Translated code
			b = (b + 1);
			// [Internal] Set completed flag
			completed = true;
		}
	}
	
	public void fmiDoStep()
	{
		// [Internal] This will block until the guard has been met
		boolean completed = false; 	 // private to the thread by default
		// [Internal] Try and get lock
		synchronized(lock)
		{
			// Translated code
			b = (b + 1);
			System.out.println("b: " + b);
			// [Internal] Set completed flag
			completed = true;
		}
	}
	
}
