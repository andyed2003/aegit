// MainEntry: MainEntry
package atomicityDec3;
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
		// Create the tasks
		environImpl task0 = new environImpl();
		masterImpl task1 = new masterImpl();
		
		// Store the tasks in a shared map to allow communication between tasks
		addTask(task0, "environImpl");
		addTask(task1, "masterImpl");
		
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
