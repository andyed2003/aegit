// MainEntry: MainEntry
package simpleProject_java;

import java.util.HashMap;

public class MainEntry {
	//	Stores all tasks and shared machines with their names
	private static HashMap<String, Object> tasks = new HashMap<String, Object>();

	public static void addTask(Object task, String name) {
		tasks.put(name, task);
	}

	public static Object getTask(String name) {
		return tasks.get(name);
	}

	public static void main(String[] args) {
		// Create the protected objects
		storeImpl protected0 = new storeImpl();

		// Store the tasks in a shared map to allow communication between tasks
		addTask(protected0, "storeImpl");

		// Create the tasks
		writerTaskImpl task0 = new writerTaskImpl();

		// Store the tasks in a shared map to allow communication between tasks
		addTask(task0, "writerTaskImpl");

		// Create the threads
		Thread thread0 = new Thread(task0);

		// Set priority
		thread0.setPriority(task0.getPriority());

		// Start the threads
		thread0.start();
	}
}
