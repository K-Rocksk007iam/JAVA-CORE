package enumpackage;

import java.util.*;

public class EnumDemo2 {
	enum Month {
		JAN, FEB, MARCH, APRIL, MAY, JUNE, JULY, AUG, SEP, OCTO, NOV, DEC
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month");

		Month mon = Month.valueOf(sc.next().toUpperCase());

		switch (mon) {
		case JAN:
			System.out.println("first");
			break;
		case FEB:
			System.out.println("second");
			break;
		case MARCH:
			System.out.println("third");
			break;
		case APRIL:
			System.out.println("fourth");
			break;
		default:
			System.out.println("Between may-dec");
		}

	}

}
