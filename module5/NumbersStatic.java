package module5;

public class NumbersStatic {
	private static int rollNo=1;

	public static int display() {
		return rollNo++;
	}
	public static void main(String[] args) {
	
		System.out.println(display());
		System.out.println(display());
		System.out.println(display());
		System.out.println(display());
		System.out.println(display());
		System.out.println(display());
	}

}
