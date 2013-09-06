package atomicityDec3;
// Task: masterImpl

public class masterImpl implements Runnable
{
	
	// Instance variables and constants
	protected int x;
	protected int priority = 5;
	
	public masterImpl()
	{
	}
	
	public void run()
	{
		while(true)
		{
			// [Internal] Timer information for repeating or periodic tasks
			long THREAD_START_TIME = System.currentTimeMillis();
			
			// Translated code
			x = p;
			
			// [Internal] Code to monitor time between periodic tasks
			long THREAD_END_TIME = System.currentTimeMillis();
			long THREAD_TIME_TAKEN = THREAD_END_TIME - THREAD_START_TIME;
			try
			{
				Thread.sleep(Math.max(100 - THREAD_TIME_TAKEN,0));
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	// Subroutines
	public int getPriority()
	{
		return priority;
	}
	
}
