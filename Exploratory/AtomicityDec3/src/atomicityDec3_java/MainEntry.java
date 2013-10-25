// MainEntry: MainEntry
package atomicityDec3_java;
import java.util.HashMap;
public class MainEntry
{
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
		// Create the protected objects
		controllerImpl protected0 = new controllerImpl();
		environImpl protected1 = new environImpl();
		
		// Store the tasks in a shared map to allow communication between tasks
		addTask(protected0, "controllerImpl");
		addTask(protected1, "environImpl");
		
		// Create the tasks
		masterImpl task0 = new masterImpl();
		
		// Store the tasks in a shared map to allow communication between tasks
		addTask(task0, "masterImpl");
		
		// Create the threads
		Thread thread0 = new Thread(task0);
		
		// Set priority
		thread0.setPriority(task0.getPriority());
		
		// Start the threads
		thread0.start();
	}
}
