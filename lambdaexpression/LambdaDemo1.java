package lambdaexpression;

interface FunInterface {
	void abstFun(int x, int y, int z);

	default void norFun() {
		System.out.println("HELLO\n (.)_(.)");
		System.out.println("    ! ");
		System.out.println("   <->");
	}
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		FunInterface obj = (int x, int y, int z) -> System.out.println(x * y * z);
		obj.abstFun(3, 5, 2);
		obj.norFun();
	}

}
