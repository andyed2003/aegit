package pumpControllerJava_java;

import pumpControllerJava_java.IEnvironmentImpl;

// EnvironTask: EnvironmentImpl

public class EnvironmentImpl implements Runnable, IEnvironmentImpl {

	// Instance variables and constants
	protected int e_level = 90;
	protected boolean e_pumpOnReq = false;
	protected boolean e_pumpOnCmd = false;
	protected boolean e_warn = false;
	private static Object lock = new Object();

	protected int priority = 5;

	public EnvironmentImpl() {
	}

	public void run() {
	}

	// Subroutines
	public void getLevel_eAPI(Pointer<Integer> p1) {
		// [Internal] This will block until the guard has been met
		boolean completed = false; // private to the thread by default
		// [Internal] Try and get lock
		synchronized (lock) {
			// Translated code
			p1.value = e_level;
			// [Internal] Set completed flag
			completed = true;
		}
	}

	public void getPumpOnReq_eAPI(Pointer<Boolean> p2) {
		// [Internal] This will block until the guard has been met
		boolean completed = false; // private to the thread by default
		// [Internal] Try and get lock
		synchronized (lock) {
			// Translated code
			p2.value = e_pumpOnReq;
			// [Internal] Set completed flag
			completed = true;
		}
	}

	public void setPumpOnCmd_eAPI(boolean p3) {
		// [Internal] This will block until the guard has been met
		boolean completed = false; // private to the thread by default
		// [Internal] Try and get lock
		synchronized (lock) {
			// Translated code
			e_pumpOnCmd = p3;
			// [Internal] Set completed flag
			completed = true;
		}
	}

	public void setWarn_eAPI(boolean p4) {
		// [Internal] This will block until the guard has been met
		boolean completed = false; // private to the thread by default
		// [Internal] Try and get lock
		synchronized (lock) {
			// Translated code
			e_warn = p4;
			// [Internal] Set completed flag
			completed = true;
		}
	}

	public int getPriority() {
		return priority;
	}

}
