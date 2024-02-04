package enumpackage;

enum month {
	JAN, FEB, MARCH, APRIL, MAY, JUNE, JULY, AUG, SEP, OCTO, NOV, DEC
}

public class EnumDemo {

	public static void main(String[] args) {

		System.out.println(month.MAY);
		month m[] = month.values();
		for (month mon : m) {
			System.out.println(mon);
		}

	}

}
