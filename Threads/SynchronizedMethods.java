/*
Author: Craig Lawlor
C00184465
Description: A program to explore synchronised methods with threads
*/
public class SynchronizedMethods {
	static int counter = 1;
	public static void main(String[] args) throws InterruptedException {
		Runnable r = () -> {
			System.out.println("ID value: " + getID());
		};
		Thread one = new Thread(r, "one");
		one.start();
		
		Thread two = new Thread(r, "two");
		two.start();
	}
	
	// only one thread can access counter when the method is synchronised
	public static synchronized int getID() {
		return counter++;
	}

}
