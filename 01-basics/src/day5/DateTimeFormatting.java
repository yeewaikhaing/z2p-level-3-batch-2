package day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle; 

public class DateTimeFormatting {

	public static void main(String[] args) {
		// predefined constants
		DateTimeFormatter date_format = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter time_format = DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter date_time_format = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime date_time = LocalDateTime.now();
		
		System.out.println("format1: " + date.format(date_format));
		System.out.println("format2: " + time_format.format(time));
		System.out.println("format3: " + date_time.format(date_time_format));
		
		//custom pattern
		System.out.println("------ Using custom pattern-------\n");
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh-m-s a");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MMMM dd yyyy 'at' h:m:ss");
		
		System.out.println("Default format: " + date);
		System.out.println("Custom format: " + f1.format(date));
		
		System.out.println("Default format: " + time);
		System.out.println("Custom format: " + time.format(f2));
		
		System.out.println("Default format: " + date_time);
		System.out.println("Custom format: " + f3.format(date_time));
		
		// localized pattern
		System.out.println("------ Using Localized Pattern ------\n");
		DateTimeFormatter format_1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		System.out.println("Default format: " + date);
		//System.out.println("Localized format: " + date.format(format_1));
		System.out.format("Long format: %s\n", date.format(format_1));
		
		System.out.println("Full format: " + 
				date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		
		System.out.println("Medium Format: " + 
		
				date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		System.out.println("Short Format: " + 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(date));
		
		
		
		
	}
}
