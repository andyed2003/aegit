package waterTankAE;
import static waterTankAE.MainEntry.controllerSM_STATES.ready;
import waterTankAE.MainEntry.controllerSM_STATES;

public class controllerImpl implements Runnable
{
	
	private static final int Low = 800;
	private static final int High = 200;
	private static final int ComputeDelay = 100;
	// Instance variables and constants
	protected  Integer c_Level = Integer.valueOf(0);
	protected  Boolean c_pumpOn = Boolean.valueOf(false);
	protected  int c_time = 0;
	protected controllerSM_STATES controllerSM = ready;
	protected int priority = 5;
	
	public controllerImpl()
	{
	}
	
	public void run()
	{
		while(true)
		{
			// [Internal] Timer information for repeating or periodic tasks
			long THREAD_START_TIME = System.currentTimeMillis();
			
			// Translated code
			((controllerImpl)MainEntry.getTask("controllerImpl")).controllerSMstateMachine();
			Pointer<Boolean> c_PumpOnPointer = new Pointer<Boolean>();
			c_PumpOnPointer.value = c_pumpOn;
			((environmentImpl)MainEntry.getTask("environmentImpl")).writePump(c_PumpOnPointer);
			Pointer<Integer> c_LevelPointer = new Pointer<Integer>();
			((environmentImpl)MainEntry.getTask("environmentImpl")).readLevel(c_LevelPointer);
			c_Level = c_LevelPointer.value;
			System.out.println("c_Level: " + c_Level);
			
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
	public void controllerSMstateMachine()
	{
		// Translated code
		switch(controllerSM)
		{
			case ready:
			if (c_Level < Low)
			{
				c_time = (c_time + ComputeDelay);
				c_pumpOn = Boolean.TRUE;
			}
			else if (c_Level > High)
			{
				c_pumpOn = Boolean.FALSE;
				c_time = (c_time + ComputeDelay);
			}
			else if (c_Level >= Low && c_Level <= High)
			{
				c_time = (c_time + ComputeDelay);
			}
			break;
		}
	}
	
	public int getPriority()
	{
		return priority;
	}
	
}
