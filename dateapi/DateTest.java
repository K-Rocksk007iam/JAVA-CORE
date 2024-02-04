package dateapi;

import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		Date d = new Date();

		TimeZone tz = TimeZone.getTimeZone("CST");
		Calendar cl = Calendar.getInstance(tz);

		int day = cl.get(Calendar.DAY_OF_MONTH);
		int month = cl.get(Calendar.MONTH);
		int year = cl.get(Calendar.YEAR);

		System.out.print(day + "-" + (month + 1) + "-" + year);

		System.out.println("\n------------------");

		int hours = cl.get(Calendar.HOUR);
		int minute = cl.get(Calendar.MINUTE);
		int seconds = cl.get(Calendar.SECOND);

		System.out.print(hours + ":" + minute + ":" + seconds);
	}

}
