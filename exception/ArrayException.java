package exception;

public class ArrayException {

	public static void main(String[] args) {
		int[] arr= {10,02,30,40};
		
		try {
		System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("INDEX IS WRONGLY GIVEN TO ARRAY");
			System.out.println(e.getMessage());
		}
	}

	
	
//	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
//		int[] arr = { 10, 02, 30, 40 };
//
//		System.out.println(arr[10]);
//	
//
//	}

}
