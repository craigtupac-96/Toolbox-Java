/*
Author: Craig Lawlor
C00184465
Description: A program to explore synchronised blocks with a count-down
*/
public class SynchroniszedBlock {

	public static void main(String[] args) {
		Countdown CD = new Countdown();
		Runnable r = () -> {
			// without the synchronised block the output of the threads cross over
			synchronized(CD){
				CD.printCount();
			}
		};
		Thread one = new Thread(r, "one");
		Thread two = new Thread(r, "two");
		one.start();
		two.start();
	}
}

class Countdown{
	public void printCount() {
		try {
			for(int i = 10; i > 0; i--) {
				System.out.println("  ---  " + i );
			}
			System.out.println("BlastOff!");
		} catch (Exception e) {
			System.out.println("Thread interrupted");
		}
	}
}