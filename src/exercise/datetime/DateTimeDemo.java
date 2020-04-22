package exercise.datetime;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.stream.IntStream;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeDemo demo = new DateTimeDemo();
		demo.storeBirthday();
		demo.previousThursday();
		demo.workWithZoneID();
		demo.workWithZoneOffset();
		demo.isFriday13();
		demo.findAllMondaysInMonth();
		demo.findMonthsLengthInYear();
		demo.workWithInstant();
	}
	
	

	private void findMonthsLengthInYear() {

		LocalDate date = LocalDate.now();
		System.out.println("Lenght of each month of " + date.getYear());
		IntStream
		.rangeClosed(1, 12)
		.forEach(month -> {
			LocalDate checked = LocalDate.of(date.getYear(), month, date.getDayOfMonth());
			
			System.out.println(checked.getMonth() + ": " + checked.lengthOfMonth());
		});
	}



	private void workWithInstant() {

		Instant instant = Instant.now();
		System.out.println("Instant is "+ instant);
		
		System.out.println(instant.atZone(ZoneId.of("Asia/Saigon")));
		
		ZonedDateTime datetime = ZonedDateTime.now();
		System.out.println(datetime.toInstant());
	}



	private void findAllMondaysInMonth() {

		LocalDate date = LocalDate.now();
		
		System.out.println("Every Moday of this month: ");
		IntStream.rangeClosed(1, date.lengthOfMonth()).filter(day -> {
			LocalDate checked = LocalDate.of(date.getYear(), date.getMonth(), day);
			return (checked.getDayOfWeek() == DayOfWeek.MONDAY);
		}).forEach(day -> System.out.println(LocalDate.of(date.getYear(), date.getMonth(), day)));
	}

	public void storeBirthday() {
		LocalDateTime birthday = LocalDateTime.of(1994, Month.MAY, 31, 5, 0, 0);

		System.out.println("my birthday is " + birthday);

	}

	public void previousThursday() {
		LocalDate date = LocalDate.now();

		while (date.getDayOfWeek() != DayOfWeek.THURSDAY) {
			date = date.minusDays(1);
		}
		System.out.println("last " + date.getDayOfWeek() + " of today is " + date);
	}

	public void workWithZoneID() {

		LocalDateTime date = LocalDateTime.now();

		IntStream.range(0, 5).forEach(x -> {
			ZoneId utc = ZoneId.of("UTC+" + x);
			System.out.println(utc + " now is " + date.now(utc));
		});

		ZoneId zone = ZoneId.of("Europe/Berlin");
		System.out.println(zone + " now is " + date.now(zone));

	}

	public void workWithZoneOffset() {

		LocalDateTime date = LocalDateTime.now();

		ZoneId zone = ZoneId.of("Asia/Saigon");

		System.out.println(zone + " now is " + date.now(zone));

		ZoneOffset zoneOffSet = zone.getRules().getOffset(date);
		System.out.println("time offset is " + zoneOffSet);

	}

	public void isFriday13() {
		LocalDate date = LocalDate.now();

		if (date.getDayOfMonth() == 13 && date.getDayOfWeek() == DayOfWeek.FRIDAY) {
			System.out.println(date + " is " + "Firday the 13th");
		} else {
			System.out.println(date + " is not " + "Firday the 13th");
		}

		LocalDateTime badDay = LocalDateTime.of(2019, Month.DECEMBER, 13, 0, 0, 0);

		if (badDay.getDayOfMonth() == 13 && badDay.getDayOfWeek() == DayOfWeek.FRIDAY) {
			System.out.println(badDay + " is " + "Firday the 13th");
		} else {
			System.out.println(badDay + " is not " + "Firday the 13th");
		}

	}

}
