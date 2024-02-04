package assignment4;

public class Account {
	private int accNo;
	private String accHoldername;
	private double balance;
	public Account(int accNo, String accHoldername, double balance) {
		super();
		this.accNo = accNo;
		this.accHoldername = accHoldername;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccHoldername() {
		return accHoldername;
	}
	public void setAccHoldername(String accHoldername) {
		this.accHoldername = accHoldername;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amt) { // Withdraw function
		if (amt < 0) {
			System.out.println("Invalid Amount Entered");
		} else if (amt > balance) {
			System.out.println("Not Enough Amount");
		} else {
			balance = balance - amt;
			System.out.println("Withdraw process is succesfull..");
		}
	}

	public void deposite(double amt) { // Deposit function
		if (amt < 0) {
			System.out.println("Invalid Amount Entered");
		} else {
			balance = balance + amt;
			System.out.println("Deposite process is succesfull..");
		}
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHoldername=" + accHoldername + ", balance=" + balance + "]";
	}
	
}
