package waterTankAE;
import static waterTankAE.MainEntry.environSM_STATES.stableSim;
import waterTankAE.MainEntry.environSM_STATES;

public class environmentImpl implements Runnable
{
	
	private static final int ReadDelay = 20;
	private static final int writeDelay = 20;
	// Instance variables and constants
	protected environSM_STATES environSM = stableSim;
	protected  Integer fmi_Level = new Integer(0);
	protected  Boolean fmi_PumpOn = new Boolean(true);
	protected  int fmi_time = 0;
	private static Object lock = new Object();
	
	protected int priority = 5;
	
	public environmentImpl()
	{
	}
	
	public void run()
	{
		while(true)
		{
			// [Internal] Timer information for repeating or periodic tasks
			long THREAD_START_TIME = System.currentTimeMillis();
			synchronized(lock)
			{
				environSMstateMachine();
				System.out.println("fmiLevel: " + fmi_Level);
			}
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
	public void environSMstateMachine()
	{
		// [Internal] This will block until the guard has been met
		boolean completed = false; 	 // private to the thread by default
			// [Internal] Try and get lock
			// Translated code
				switch(environSM)
				{
					case stableSim:
					if (fmi_PumpOn.booleanValue() == Boolean.FALSE)
					{
						fmi_Level = ((fmi_Level) - 1);
					}
					else if (fmi_PumpOn.booleanValue() == Boolean.TRUE)
					{
						fmi_Level = ((fmi_Level) + 1);
					}
					break;
			}
		}
	}
	
	public void readLevel(Pointer<Integer> p)
	{
		// [Internal] This will block until the guard has been met
		boolean completed = false; 	 // private to the thread by default
		while(!completed)
		{
			// [Internal] Try and get lock
			synchronized(lock)
			{
				// Translated code
				fmi_time = (fmi_time + ReadDelay);
				p.value = fmi_Level ;
				// [Internal] Set completed flag
				completed = true;
			}
		}
	}
	
	public void writePump(Pointer<Boolean> p )
	{
		// [Internal] This will block until the guard has been met
		boolean completed = false; 	 // private to the thread by default
		while(!completed)
		{
			// [Internal] Try and get lock
			synchronized(lock)
			{
				// Translated code
				fmi_PumpOn = p.value;
				fmi_time = (fmi_time + writeDelay);
				// [Internal] Set completed flag
				completed = true;
			}
		}
	}
	
	public int getPriority()
	{
		return priority;
	}
	
}
