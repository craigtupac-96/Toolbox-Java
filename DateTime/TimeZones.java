/*
Author: Craig Lawlor
C00184465
Description: A program to show dates and times in local formats and by time zone
*/
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;
import java.util.function.Predicate;

public class TimeZones {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dtf.format(dt)); // output layout: 09/04/18 12:04
		
		// New York Time
		ZonedDateTime ny = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(dtf.format(ny)); // output layout: 09/04/18 07:04
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		
		Predicate<String> condition = str -> str.contains("Dublin");
		
		zones.forEach(z -> {
			if (condition.test(z)) {
				System.out.println(z); // output: Europe/Dublin
			}		
		});
	}

}
