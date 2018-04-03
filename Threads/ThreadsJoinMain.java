/*
Author: Craig Lawlor
C00184465
Description: A program to explore basic threads
*/
public class ThreadsJoinMain {

	public static void main(String[] args) {
		ThreadsJoin t1 = new ThreadsJoin("t1");
		ThreadsJoin t2 = new ThreadsJoin("t2");
		ThreadsJoin t3 = new ThreadsJoin("t3");
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		// thread 3 won't start until thread 2 is complete
		t3.start();
	}

}
