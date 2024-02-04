package assignment4;

public class SavingAccount extends Account {
	private boolean isSalarised;

	public SavingAccount(int accNo, String accHoldername, double balance, boolean isSalarised) {
		super(accNo, accHoldername, balance);
		this.isSalarised = isSalarised;
	}

	public boolean isSalarised() {
		return isSalarised;
	}

	public void setSalarised(boolean isSalarised) {
		this.isSalarised = isSalarised;
	}

	@Override
	public String toString() {
		return "SavingAccount [isSalarised=" + isSalarised + "]";
	}
	
	
}
