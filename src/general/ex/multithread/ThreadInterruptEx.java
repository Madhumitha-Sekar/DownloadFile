package general.ex.multithread;

class ABCD extends Thread {
	Thread threadToInterrupt;

	// overriding the run() method
	public void run() {
		// invoking the method interrupt
		System.out.println("The current thread name (ABCD) is: " + Thread.currentThread().getName());
		threadToInterrupt.interrupt();
		System.out.println("The current thread name (after ABCD) is: " + Thread.currentThread().getName());
		System.out.println("Thread interrupted exception occured... ");
	}
}

public class ThreadInterruptEx {
	// main method
	public static void main(String[] argvs) {
		try {
			// creating an object of the class ABC
			ABCD th1 = new ABCD();

			th1.threadToInterrupt = Thread.currentThread();
			th1.start();
			th1.join();
			
			ABCD th2 = new ABCD();
			th2.threadToInterrupt = Thread.currentThread();
			th2.start();
			// invoking the join() method leads
			// to the generation of InterruptedException
			th2.join();
		} catch (Exception ex) {
			System.out.println("The exception has been caught. " + ex);
		}
		System.out.println("Main method ended...");
	}
}
