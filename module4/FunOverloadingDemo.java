package module4;

public class FunOverloadingDemo {

	public int add(int a, int b) {

		return (a + b);
	}

	public double add(Double a, int b) {

		return (a + b);
	}

	public double add(Double a, Double b) {

		return (a + b);
	}
	

	public double add(Double a, Double b, int c) {

		return (a + b + c);
	}

	public static void main(String[] args) {
		FunOverloadingDemo over = new FunOverloadingDemo();
		System.out.println(over.add(10, 20));
		System.out.println(over.add(20.9, 10));
		
		System.out.println(over.add(20.7, 30.7));
		System.out.println(over.add(10.1, 20.1, 20));
	}

}
