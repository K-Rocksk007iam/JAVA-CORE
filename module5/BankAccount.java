package module5;

public class BankAccount {
	
	private int accNo;
	private double bal;
	private static int idNum=1;
	
	public BankAccount() {
		accNo=idNum;
		bal=0.0;
		
	}
	
	public static int getId() {
		System.out.println("idNum is :" +idNum); // direct initialized at compile time
		return idNum++;
		
		
	}
	
	public static void main(String args[]) {
		System.out.println(getId());   // direct call
		
		BankAccount obj=new BankAccount();
		System.out.println(obj.getId()); // with object
		
		System.out.println(BankAccount.getId()); // with class
		
	}
}
