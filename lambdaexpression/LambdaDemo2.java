package lambdaexpression;

//without lambda 
interface FunInt {
	void abstFun(int x, int y, int z);

}

class Test implements FunInterface {

	public void abstFun(int x, int y, int z) {
		System.out.println(x * y * z);

	}

}

public class LambdaDemo2 {

	public static void main(String[] args) {
		Test obj = new Test();
		obj.abstFun(10, 2, 3);

	}

}
