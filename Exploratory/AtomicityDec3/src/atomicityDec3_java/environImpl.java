package atomicityDec3_java;
// Protected: environImpl

public class environImpl
{
	
	// Instance variables and constants
	protected static int b = 99;
	private static Object lock = new Object();
	
	public environImpl()
	{
		
	}
	
	// Subroutines
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
	
	public void fmiGetInteger(Pointer<Integer> p)
	{
		// [Internal] This will block until the guard has been met
		boolean completed = false; 	 // private to the thread by default
		// [Internal] Try and get lock
		synchronized(lock)
		{
			// Translated code
			p.value = b ;
			// [Internal] Set completed flag
			completed = true;
		}
	}
	
}
