/*
Author: Craig Lawlor
C00184465
Description: A program to show dates and times 
*/
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate); // output layout: 2018-04-09
		
		LocalDate specificDate = LocalDate.of(1990, 04, 29);
		System.out.println(specificDate); // output layout: 1990-04-29
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime); // output layout: 12:15:55.129
		
		LocalTime specificTime = LocalTime.of(13, 10);
		System.out.println(specificTime); // output layout: 13:10

		LocalDateTime currentDT = LocalDateTime.now();
		System.out.println(currentDT); // output layout: 2018-04-09T12:15:55.130
		
		LocalDateTime specificDT = LocalDateTime.of(specificDate, specificTime);
		System.out.println(specificDT); // output layout: 1990-04-29T13:10
	}

}
