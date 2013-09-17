package atomicityDec3_java;
// Task: masterImpl

public class masterImpl implements Runnable
{
	
	// Instance variables and constants
	protected int x = 0;
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
			((environImpl)MainEntry.getTask("environImpl")).env_fmiDoStep();
			((controllerImpl)MainEntry.getTask("controllerImpl")).controller_fmiDoStep();
			Pointer<Integer> xPointer = new Pointer<Integer>();
			((environImpl)MainEntry.getTask("environImpl")).fmiGetInteger(xPointer);
			x = xPointer.value;
			((controllerImpl)MainEntry.getTask("controllerImpl")).fmiSetInteger(x);
			
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
