/*
Author: Craig Lawlor
C00184465
Description: A program to show different formats of dates and times
*/
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class FormatDateTime {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
		System.out.println(df.format(currentDate)); // output layout: 2018-04-09
		
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter tf = DateTimeFormatter.ISO_TIME;
		System.out.println(tf.format(currentTime)); // output layout: 12:11:46.537
		
		LocalDateTime currentDT = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(dtf.format(currentDT)); // output layout: 2018-04-09T12:11:46.538
		
		// using local formatting
		DateTimeFormatter f_long = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(f_long.format(currentDT)); // output layout: 09 April 2018
		
		DateTimeFormatter f_short = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(f_short.format(currentDT)); // output layout: 09/04/18
		
		// french formatting
		String fr_short = f_short.withLocale(Locale.FRENCH).format(currentDT);
		System.out.println(fr_short); // output layout: 09/04/18
		String fr_long = f_long.withLocale(Locale.FRENCH).format(currentDT);
		System.out.println(fr_long); //output layout: 9 avril 2018
		
		// custom formatting
		DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
				.appendValue(ChronoField.MONTH_OF_YEAR)
				.appendLiteral("|~|")
				.appendValue(ChronoField.DAY_OF_MONTH)
				.appendLiteral("|~|")
				.appendValue(ChronoField.YEAR);
		DateTimeFormatter f = b.toFormatter();
		
		System.out.println(f.format(currentDT)); // output layout: 4|~|9|~|2018
		
	}

}
