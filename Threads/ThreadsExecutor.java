import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Author: Craig Lawlor
C00184465
Description: A program to explore synchronised blocks with a count-down
*/
public class ThreadsExecutor {

	public static void main(String[] args) {
		// creating a pool of 5 threads
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread("I'm thread " + i);
			executor.execute(worker);
		}
		executor.shutdown();
		while(!executor.isTerminated()) {  }
		
		System.out.println("Finished all threads");
	}  
}
