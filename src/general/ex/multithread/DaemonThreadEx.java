package general.ex.multithread;

public class DaemonThreadEx extends Thread {

	public void run() {
//		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().isDaemon());
		
		if (Thread.currentThread().isDaemon()) {
			System.out.println("The current thread " + Thread.currentThread().getName() + " is Daemon thread... ");
		} else {
			System.out.println("The current thread " + Thread.currentThread().getName() + " is user thread... ");
		}
	}
	
	public static void main(String[] args) {
		DaemonThreadEx thread1 = new DaemonThreadEx();
		DaemonThreadEx thread2 = new DaemonThreadEx();
		DaemonThreadEx thread3 = new DaemonThreadEx();
		
		thread1.setDaemon(true);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
//		thread2.setDaemon(true); // It throws IllegalThreadStateException
		
	}

}
