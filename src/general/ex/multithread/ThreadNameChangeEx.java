package general.ex.multithread;

public class ThreadNameChangeEx extends Thread {

	// Default constructor
	public ThreadNameChangeEx() {
	}
	
	// Constructor of the class
	public ThreadNameChangeEx(String threadName) {
		super(threadName);
	}

	public void run() {
		System.out.println("Thread running... Current Thread Name: " + Thread.currentThread().getName());
	}

	
	public static void main(String args[]) {
		System.out.println("Current main thread name: " + Thread.currentThread().getName());
		System.out.println("Current main thread priority: " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
		System.out.println("Current main thread priority after priority setting: " + Thread.currentThread().getPriority() + "\n");
		
		ThreadNameChangeEx thread1 = new ThreadNameChangeEx();
		ThreadNameChangeEx thread2 = new ThreadNameChangeEx();
		
		//Another type to change the name of the thread (Without using setName - like using constructor)
		ThreadNameChangeEx thread3 = new ThreadNameChangeEx("Chrome");

		System.out.println("Priority of thread1: " + thread1.getPriority());
		System.out.println("Priority of thread2: " + thread2.getPriority());
		System.out.println("Priority of thread3: " + thread3.getPriority());
		
		System.out.println("Name of thread1: " + thread1.getName());
		System.out.println("Name of thread2: " + thread2.getName());
		System.out.println("Name of thread3 (set the name of the thread at the time of creation of the thread): " + thread3.getName());
		
		System.out.println();
		thread1.start();
		thread2.start();
		thread3.start();
		
		thread3.setPriority(MAX_PRIORITY); // 'Chrome' -- 'Priority' thread
//		thread3.setPriority(15); // It throws IllegalArgumentException

		// Using the 'setName' to set the name of the thread
		thread1.setName("Google");
		System.out.println("After changing name of thread1: " + thread1.getName());
	}

}
