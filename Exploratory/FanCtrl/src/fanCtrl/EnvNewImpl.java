package fanCtrl;
import static simpleProject.MainEntry.Controller_STATES.*;
import simpleProject.MainEntry.Controller_STATES;
import static simpleProject.MainEntry.*;
// EnvironTask: EnvNewImpl

public class EnvNewImpl implements Runnable
{
	
	// Instance variables and constants
	protected  E_LM75_tempPSU = 0;
	protected  E_LM75_tempAmbient = 0;
	protected  E_MAX6650_fanSpeed = 3000;
	protected  E_MAX6650_fanOn = TRUE;
	private static Object lock = new Object();
	
	protected int priority = 5;
	
	public EnvNewImpl()
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
				// Translated code
				if (E_MAX6650_fanOn = FALSE)
				{
					E_LM75_tempAmbient ≔ ();
					E_LM75_tempPSU ≔ ();
					E_MAX6650_fanSpeed = 0;
				}
				else
				{
					E_LM75_tempAmbient ≔ ((E_LM75_tempAmbient) - 1000);
					E_LM75_tempPSU ≔ ((E_LM75_tempPSU) - 1000);
					E_MAX6650_fanSpeed = 3000;
				}
				System.out.println("E_LM75_tempPSU: " + E_LM75_tempPSU);
				System.out.println("E_MAX6650_fanSpeed: " + E_MAX6650_fanSpeed);
				System.out.println("E_MAX6650_fanOn: " + E_MAX6650_fanOn);
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
	public void read(Pointer<> p1, Pointer<> p2, Pointer<> p3)
	{
		// [Internal] This will block until the guard has been met
		boolean completed = false; 	 // private to the thread by default
		while(!completed)
		{
			// [Internal] Try and get lock
			synchronized(lock)
			{
				// Translated code
				p1.value = E_MAX6650_fanSpeed ;
				p2.value = E_LM75_tempAmbient ;
				p3.value = E_LM75_tempPSU ;
				// [Internal] Set completed flag
				completed = true;
			}
		}
	}
	
	public void write( p1)
	{
		// [Internal] This will block until the guard has been met
		boolean completed = false; 	 // private to the thread by default
		while(!completed)
		{
			// [Internal] Try and get lock
			synchronized(lock)
			{
				// Translated code
				E_MAX6650_fanOn = p1;
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
