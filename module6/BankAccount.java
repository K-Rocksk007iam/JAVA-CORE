package module6;

public class BankAccount {
	private int accNo;
	private String accHoldername;
	private double accBal;

	public BankAccount(int accNo, String accHoldername, double accBal) {
		super();
		this.accNo = accNo;
		this.accHoldername = accHoldername;
		this.accBal = accBal;
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

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accHoldername=" + accHoldername + ", accBal=" + accBal + "]";
	}

}
