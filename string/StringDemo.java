package string;

public class StringDemo {

	public static void main(String[] args) {
		String str = new String("KUNAL");
		String str1= new String("kunal");
		
		if(str.equals(str1)) {
			System.out.println("EQUAL");
		}
		
		String str2 = new String("          hello good afternoon all");
		
		System.out.println(str.charAt(0));
		System.out.println(str.toLowerCase());
		
		System.out.println(str2.trim());
		System.out.println(str.lastIndexOf('L'));
		System.out.println(str2.lastIndexOf('g'));
		
		System.out.println(str.replace('K', 'k'));
		
		if(str.equalsIgnoreCase(str1)) {
			System.out.println("same");
		}
		
		int a=200;
		System.out.println(str.valueOf(a));
		System.out.println(str.repeat(3));
		System.out.println(str.replace("KUNAL","HUNAL" ));
		
		
		System.out.println(str.contains("tu"));
		System.out.println(str.endsWith("L"));
		System.out.println(str.isEmpty());
	}

}
