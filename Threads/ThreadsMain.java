/*
Author: Craig Lawlor
C00184465
Description: A program to explore basic threads
*/
public class ThreadsMain {

	public static void main(String[] args) {
		(new Thread(new ThreadsRunnable())).start();
		
		(new ThreadsThread()).start();
		
		Runnable r1 = new Runnable() {
			@Override
			public void run()
			{
				// perform some work inside the thread
				System.out.println("Hello from " + Thread.currentThread().getName() +
						" NOT USING LAMBDA");
			}
		};
		
		// creates a runnable object using lambda notation
		Runnable r2 = () -> System.out.println("Hello from " + Thread.currentThread().getName() + 
				" USING LAMBDA NOTATAION");
		
		// create and start a thread using the first runnable object // given a name also
		Thread t1 = new Thread(r1, "Thread t1");
		t1.start();
		
		// create and start a second thread using the runnable object with the lambda notation
		Thread t2 = new Thread(r2);
		t2.start();
	}

}
