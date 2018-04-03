
public class ThreadsJoin extends Thread {
	// Constructor to assign a user defined name to the thread
	public ThreadsJoin(String name) {
		super(name);
	}
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			try {
				// stop the thread for a half second
				Thread.sleep(500);
			} catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " i = " + i);
		}
	}
}
