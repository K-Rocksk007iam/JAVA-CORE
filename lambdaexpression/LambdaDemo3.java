package lambdaexpression;

interface FunInterface2 {
	void abstFun(int x, int y, int z);

}

public class LambdaDemo3 {

	public static void main(String[] args) {

		FunInterface obj = (int x, int y, int z) -> {
			System.out.println(x * 2 * z);
			System.out.println(x * 20 * z);
			System.out.println(12 * 2 * z);
			System.out.println(x * 24 * 5);
		};
		obj.abstFun(3, 5, 2);

	}

}
