package module4;

public class OverloadMainMethod {

	public int main(int a, int b) {
		System.out.print("BOTH integer : "+a+"+"+b+" : ");
		return (a + b);
	}

	

	public double main(Double a, Double b) {
		System.out.print("BOTH Double : "+a+"+"+b+" : ");
		return (a + b);
	}
	

	public double main(Double a, Double b, int c) {
		System.out.print("three parameter : "+a+"+"+b+"+"+c+" : ");
		return (a + b + c);
	}

	public static void main(String[] args) {
		System.out.println("@ main method @");
		OverloadMainMethod  over = new OverloadMainMethod() ;
		
		
		System.out.println(over.main(10, 20));
		System.out.println(over.main(20.7, 30.7));
		System.out.println(over.main(10.1, 20.1, 20));

	}

}
