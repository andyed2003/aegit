// MainEntry: MainEntry
package waterTankAE;
import java.util.HashMap;
public class MainEntry
{
	
	
	
	public enum environSM_STATES
	{
		stableSim,
	}
	
	
	public enum controllerSM_STATES
	{
		ready,
	}
	
	
	
	
	//	Stores all tasks and shared machines with their names
	private static HashMap<String, Object> tasks = new HashMap<String, Object>();
	
	public static void addTask(Object task, String name)
	{
		tasks.put(name, task);
	}
	
	public static Object getTask(String name)
	{
		return tasks.get(name);
	}
	
	public static void main(String [] args)
	{
		// Create the tasks
		controllerImpl task0 = new controllerImpl();
		environmentImpl task1 = new environmentImpl();
		
		// Store the tasks in a shared map to allow communication between tasks
		addTask(task0, "controllerImpl");
		addTask(task1, "environmentImpl");
		
		// Create the threads
		Thread thread0 = new Thread(task0);
		Thread thread1 = new Thread(task1);
		
		// Set priority
		thread0.setPriority(task0.getPriority());
		thread1.setPriority(task1.getPriority());
		
		// Start the threads
		thread0.start();
		thread1.start();
	}
}
