package constructor;

public class Account {
	private int accNO;
	private String accHolder;
	private double accBal;

	public Account() {
		System.out.println("This is Default Constructor"); // Default Constructor
		accNO = 0;
		accHolder = "";
		accBal = 0.0;
	}

	public Account(int accNo, String accHolder, double accBal) { // parameterized constructor
		this.accNO = accNo;
		this.accHolder = accHolder;
		this.accBal = accBal;
	}

	public int getAccNO() { // getter and setter method
		return accNO;
	}

	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public void withdraw(double amt) { // Withdraw function
		if (amt < 0) {
			System.out.println("Invalid Amount Entered");
		} else if (amt > accBal) {
			System.out.println("Not Enough Amount");
		} else {
			accBal = accBal - amt;
			System.out.println("Withdraw process is succesfull..");
		}
	}

	public void deposite(double amt) { // Deposit function
		if (amt < 0) {
			System.out.println("Invalid Amount Entered");
		} else {
			accBal = accBal + amt;
			System.out.println("Deposite process is succesfull..");
		}
	}

	public void transfer(Account account1, double amt) { // transfer function
		if (amt < 0) {
			System.out.println("Invalid Amount Entered");
		} else if (amt > accBal) {
			System.out.println("Not Enough Amount");
		} else {
			accBal = accBal - amt;
			double bal = account1.getAccBal();
			double new_bal = bal + amt;
			account1.setAccBal(new_bal);
			System.out.println("Tarnsfer is Successfull");
		}

	}

	@Override
	public String toString() {
		return "Account [accNO=" + accNO + ", accHolder=" + accHolder + ", accBal=" + accBal + "]";
	}

}
