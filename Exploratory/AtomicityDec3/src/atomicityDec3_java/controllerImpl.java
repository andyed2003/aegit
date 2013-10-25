package atomicityDec3_java;
// Protected: controllerImpl

public class controllerImpl
{
	
	// Instance variables and constants
	protected static int a = 0;
	protected static int used_a = 0;
	private static Object lock = new Object();
	
	public controllerImpl()
	{
		
	}
	
	// Subroutines
	public void controller_fmiDoStep()
	{
		// [Internal] This will block until the guard has been met
		boolean completed = false; 	 // private to the thread by default
		// [Internal] Try and get lock
		synchronized(lock)
		{
			// Translated code
			used_a = ((a) / 2);
			// [Internal] Set completed flag
			completed = true;
		}
	}
	
	public void fmiSetInteger(int p)
	{
		// [Internal] This will block until the guard has been met
		boolean completed = false; 	 // private to the thread by default
		// [Internal] Try and get lock
		synchronized(lock)
		{
			// Translated code
			a = p;
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
			used_a = ((a) / 2);
			System.out.println("used_a: " + used_a);
			// [Internal] Set completed flag
			completed = true;
		}
	}
	
}
