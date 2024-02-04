package dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateDemo3 {

	public static void main(String[] args) {
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println(currentTime);

		System.out.println("---------------------------");

		LocalDate date1 = currentTime.toLocalDate();
		System.out.println(date1);

		System.out.println("----------MONTH--------------");

		Month month = currentTime.getMonth();
		System.out.println(month);

		System.out.println("----------DATE-------------");

		int day = currentTime.getDayOfMonth();
		System.out.println(day);

		System.out.println("----------SECONDS-------------");

		int sec = currentTime.getSecond();
		System.out.println(sec);

		System.out.println("----------HRS-------------");

		int hrs = currentTime.getHour();
		System.out.println(hrs);

		System.out.println("----------MIN-------------");

		int min = currentTime.getHour();
		System.out.println(min);

		System.out.println("---------------------------");

		System.out.println(month + " " + day + " " + hrs + ":" + min + ":" + sec);

		System.out.println("\n--------SET HOURS|MIN-----------");
		LocalTime t1 = LocalTime.of(12, 2);
		System.out.println(t1);

		System.out.println("---------------------------");
		LocalTime t2 = LocalTime.parse("12:30:45");
		System.out.println(t2);
		System.out.println("---------------------------");
		System.out.println(t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
	}

}
