package general.ex.multithread;

//ABC class implements the interface Runnable  
class ABC implements Runnable {
	public void run() {
		System.out.println("Thread 4...");
		// try-catch block
		try {
			// moving thread t2 to the state timed waiting
			System.out.println("Thread 5...");
			Thread.sleep(100);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("Thread 5.1...");
		System.out.println(
				"The state of thread t1 while it invoked the method join() on thread t2 -" + ThreadState.t1.getState());
		System.out.println("Thread 6...");

		// try-catch block
		try {
			System.out.println("Thread 7...");
			Thread.sleep(200);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread 8...");
	}
}

// ThreadState class implements the interface Runnable
public class ThreadState implements Runnable {
	public static Thread t1;
	public static ThreadState obj;

	// main method
	public static void main(String argvs[]) {
		// creating an object of the class ThreadState
		obj = new ThreadState();
		t1 = new Thread(obj);

		// thread t1 is spawned
		// The thread t1 is currently in the NEW state.
		System.out.println("The state of thread t1 after spawning it - " + t1.getState());

		// invoking the start() method on
		// the thread t1
		t1.start();
		System.out.println("Thread 1...");
		
		// thread t1 is moved to the Runnable state
		System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());
	}

	public void run() {
		System.out.println("Thread 2...");
		ABC myObj = new ABC();
		Thread t2 = new Thread(myObj);

		// thread t2 is created and is currently in the NEW state.
		System.out.println("The state of thread t2 after spawning it - " + t2.getState());
		t2.start();

		// thread t2 is moved to the runnable state
		System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());
		System.out.println("Thread 3...");
		
		// try-catch block for the smooth flow of the program
		try {
			System.out.println("Thread 9...");
			// moving the thread t1 to the state timed waiting
			Thread.sleep(200);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("The state of thread t2 after invoking the method sleep() on it - " + t2.getState());
		System.out.println("Thread 10...");
		
		// try-catch block for the smooth flow of the program
		try {
			System.out.println("Thread 11...");
			// waiting for thread t2 to complete its execution
			t2.join();
			System.out.println("Thread 11.1...");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread 12...");
		System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());
	}

}