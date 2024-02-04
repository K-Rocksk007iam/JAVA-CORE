package constructor_;

public class Account1 {
	private int accNO;
	private String accHolder;
	private double accBal;

	public Account1() {
		System.out.println("This is Default Constructor"); // Default Constructor
		accNO = 0;
		accHolder = "";
		accBal = 0.0;
	}

	public Account1(int accNo, String accHolder, double accBal) { // parameterized constructor
		this.accNO = accNo;
		this.accHolder = accHolder;
		this.accBal = accBal;
	}

	public int getAccNO() {
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

	@Override
	public String toString() {
		return "Account1 [accNO=" + accNO + ", accHolder=" + accHolder + ", accBal=" + accBal + "]";
	}

	public boolean checkName(String accHolder) {
		char ch = ' ';
		boolean validName = false;
		for (int i = 0; i < accHolder.length(); i++) {
			ch = accHolder.charAt(i);
			if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {// or (ch >='A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
				validName = true;
			} else {
				validName = false;
				break;
			}
		}

		if (validName == true) {
			return true;
		} else {
			return false;
		}

	}

	public boolean checkAll(int accNO, String accHolder, double accBal) {

		if (accNO < 0) {
			
			System.out.println("accno Must be +ve and no character");
			return false;
		}

		if (!checkName(accHolder)) {
			System.out.println("INAVLID name");
			return false;
		}

		if (accBal < 0) {
			System.out.println("Balanace Must be +ve");
			return false;
		}

		else {
			return true;
		}

	}

}
