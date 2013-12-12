package simpleProject_java;
// Protected: storeImpl

public class storeImpl
{
	
	// Instance variables and constants
	protected static int b = 0;
	private static Object lock = new Object();
	
	public storeImpl()
	{
		
	}
	
	// Subroutines
	public void write(int param)
	{
		// [Internal] This will block until the guard has been met
		boolean completed = false; 	 // private to the thread by default
		// [Internal] Try and get lock
		synchronized(lock)
		{
			// Translated code
			b = param;
			// [Internal] Set completed flag
			completed = true;
		}
	}
	
}
