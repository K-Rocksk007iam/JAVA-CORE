package string;

public class StringBuilderDemo {
	public static void main(String[] args) {
		
		StringBuilder strb= new StringBuilder("Sandy");
		strb.append(" yo yo");
		System.out.println(strb);
		
		System.out.println(strb.replace(6, 8,"BOI"));
		
		System.out.println(strb.charAt(2));
		
		System.out.println(strb.indexOf("n"));
		
		System.out.println(strb.lastIndexOf("a"));
		
		System.out.println(strb.capacity());
		
		System.out.println(strb.length());
	}
}
