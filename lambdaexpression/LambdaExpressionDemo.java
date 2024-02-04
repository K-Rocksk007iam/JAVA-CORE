package lambdaexpression;

public class LambdaExpressionDemo {

	interface Interface1 {
		int operation(int x, int y);

	}

	interface Interface2 {
		void msg(String message);

	}
	
	public static int operate(int x, int y, Interface1 obj) {
		return obj.operation(x, y);
	}
	
	public static void main(String[] args) {
		Interface1 add= (x, y) ->x+y;
		Interface1 mul=(x, y) ->x*y;
		
		System.out.println(operate(2, 3, mul));
		System.out.println(operate(10, 20, add));
		
		Interface2 obj=message -> System.out.println("HELLO "+message);
		obj.msg("KUNAL");
	}
}
