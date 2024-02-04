package string;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer strb = new StringBuffer("Sandy");
		strb.append(" yo yo");
		
		System.out.println(strb.insert(0, "I AM "));
		
		System.out.println(strb.delete(2, 5));
		
		
		
		System.out.println(strb.indexOf("n"));

		System.out.println(strb.lastIndexOf("a"));

		System.out.println(strb.capacity());

		System.out.println(strb.length());
		System.out.println(strb);

		System.out.println(strb.replace(6, 8, "BOI"));

		System.out.println(strb.charAt(2));

	}

}
