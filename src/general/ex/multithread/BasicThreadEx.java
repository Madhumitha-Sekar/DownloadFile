package general.ex.multithread;

public class BasicThreadEx {

	public static void main(String[] args) {
		threadTypesEx();
		ThreadTwiceEx.main(null);
	}

	private static void threadTypesEx() {
		ExtendThreadEx.main(null);
		ImplementRunnableEx.main(null);
		ThreadNameEx.main(null);
		ThreadRunnableExample.main(null);
	}

}

class ThreadTwiceEx extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread twice example of run() method executed...");
	}
	
	public static void main (String args[]) {
		ThreadTwiceEx thread5 = new ThreadTwiceEx();
		thread5.start();
		System.out.println("Thread twice example executed (For first start)...");
		thread5.start(); // It throws the 'IllegalThreadStateException' exception
		System.out.println("Thread twice example executed (For second start)...");
	}
}

class ThreadRunnableExample implements Runnable {

	@Override
	public void run() {
		System.out.println("Example of ThreadRunnableExample (Run method) is running... ");
	}
	
	public static void main(String args[]) {
		Runnable runnable = new ThreadRunnableExample();
		Thread thread4 = new Thread(runnable, "My First Thread");
		thread4.start();
		String str = thread4.getName();
		System.out.println("The output of thread4 is: " + str);
		
	}

}

class ThreadNameEx {
	public static void main (String args[]) {
		Thread thread3 = new Thread("My first thread");
		thread3.start();
		String str = thread3.getName();
		System.out.println(str);
	}
}

class ImplementRunnableEx implements Runnable {

	@Override
	public void run() {
		System.out.println("Example of ImplementRunnableEx (Run method) is running... ");
	}
	
	public static void main (String args[]) {
		Runnable runnable = new ImplementRunnableEx();
		Thread thread2 = new Thread(runnable);
		thread2.start();
	}
	
}

class ExtendThreadEx extends Thread {
	
	public void run() {
		System.out.println("Example of ExtendThreadEx (Run method) is running... ");
	}
	
	public static void main(String[] args) {
		ExtendThreadEx thread1 = new ExtendThreadEx();
		thread1.start();
	}
	
}
