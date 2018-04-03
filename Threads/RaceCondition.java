/*
Author: Craig Lawlor
C00184465
Description: A program to explore race conditions
*/
public class RaceCondition {
	static double a = 10;
	static double b;
	public static void main(String[] args) {
		Runnable r1 = () ->
		{
				if(a == 10)
			try {
				Thread.sleep(0);  // if this is not 0 the result will be 6.0
				b = a/2.0;
				System.out.println(Thread.currentThread().getName() + ": " + b);
			} catch (InterruptedException e) { }
		};
		Runnable r2 = () -> 
		{
			a = 12;
		};
		Thread thdA = new Thread(r1, "Thread A");
		Thread thdB = new Thread(r2, "Thread B");
		thdA.start();
		thdB.start();		
	}
}
