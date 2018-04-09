/*
Author: Craig Lawlor
C00184465
Description: A program to get the difference between a start and end time
*/
import java.time.Duration;
import java.time.Instant;

public class StartEndTime {

	public static void main(String[] args) throws InterruptedException {
		
		Instant start = Instant.now();
		System.out.println(start); 
		
		Thread.sleep(1000);
		
		Instant end = Instant.now();
		System.out.println(end);
		
		Duration elapsed = Duration.between(start, end);
		System.out.println("Elapsed: " + elapsed.toMillis() + " milliseconds");
	}

}
