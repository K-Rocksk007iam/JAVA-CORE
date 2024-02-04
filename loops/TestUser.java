package loops;

public class TestUser {

	public static void main(String[] args) {
		UserDemo user = new UserDemo();
		System.out.println("Enter The information \n");
		user.accept();
		user.display();
		
		
		boolean age=user.checkAge();
		boolean sal=user.checkSal();
		
		if(age==true && sal==true) {
			System.out.println("VALID INPUT");
		}
		else {
			System.out.println("BOTH OR ONE INVALID INPUTS");
		}

	}

}
