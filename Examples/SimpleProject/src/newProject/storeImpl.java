package newProject;
// Protected: storeImpl

public class storeImpl
{
	
	// Instance variables and constants
	protected static  b = 0;
	private static Object lock = new Object();
	
	public storeImpl()
	{
		
	}
	
	// Subroutines
	public void write(Pointer<> param)
	{
		// [Internal] This will block until the guard has been met
		boolean completed = false; 	 // private to the thread by default
		while(!completed)
		{
			// [Internal] Try and get lock
			synchronized(lock)
			{
				// Translated code
				param.value = b ;
				// [Internal] Set completed flag
				completed = true;
			}
		}
	}
	
}
