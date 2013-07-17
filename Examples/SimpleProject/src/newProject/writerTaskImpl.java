package newProject;
// Task: writerTaskImpl

public class writerTaskImpl implements Runnable
{
	
	// Instance variables and constants
	protected  a = 0;
	protected int priority = 5;
	
	public writerTaskImpl()
	{
	}
	
	public void run()
	{
		while(true)
		{
			// [Internal] Timer information for repeating or periodic tasks
			long THREAD_START_TIME = System.currentTimeMillis();
			
			// Translated code
			a ≔ ();
			Pointer<> aPointer = new Pointer<>();
			((storeImpl)MainEntry.getTask("storeImpl")).write(aPointer);
			a = aPointer.value;
			System.out.println("just written a: " + a);
			
			// [Internal] Code to monitor time between periodic tasks
			long THREAD_END_TIME = System.currentTimeMillis();
			long THREAD_TIME_TAKEN = THREAD_END_TIME - THREAD_START_TIME;
			try
			{
				Thread.sleep(Math.max(0 - THREAD_TIME_TAKEN,0));
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
