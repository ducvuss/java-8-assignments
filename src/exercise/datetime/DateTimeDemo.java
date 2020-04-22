package exercise.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
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

}
