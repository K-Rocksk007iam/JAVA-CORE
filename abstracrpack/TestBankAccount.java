package abstracrpack;

abstract class BankAccount {
	protected int id;
	protected float balance;

	public BankAccount(int id, float balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	abstract float calculateIntrest();

	abstract float calculateNetAmount();

}

class CurrentAccount extends BankAccount {

	public CurrentAccount(int id, float balance) {
		super(id, balance);
	}

	protected float calculateIntrest() {
		return 0.7f * balance;
	}

	float calculateNetAmount() {
		
		return (0.7f * balance) + balance;
	}

}

class LoanAccount extends BankAccount {

	public LoanAccount(int id, float balance) {
		super(id, balance);

	}

	protected float calculateIntrest() {
		return 0.1f * balance;

	}

	@Override
	float calculateNetAmount() {

		return (0.1f * balance) + balance;
	}

}

class SavingAccount extends BankAccount {

	public SavingAccount(int id, float balance) {
		super(id, balance);

	}

	protected float calculateIntrest() {
		return 0.56f * balance;
	}

	@Override
	float calculateNetAmount() {

		return (0.56f * balance) + balance;
	}
}

public class TestBankAccount {
	public static void main(String[] args) {

		CurrentAccount account1 = new CurrentAccount(1, 23000);
		System.out.println("current account Intrest will be : " + account1.calculateIntrest());
		System.out.println("Net Amount will be : " + account1.calculateNetAmount());

		LoanAccount account2 = new LoanAccount(2, 9000);

		System.out.println("\nloan account Intrest will be : " + account2.calculateIntrest());
		System.out.println("Net Amount will be : " + account2.calculateNetAmount());

		SavingAccount account3 = new SavingAccount(3, 34000);

		System.out.println("\nsaving account Intrest will be : " + account3.calculateIntrest());
		System.out.println("Net Amount will be : " + account3.calculateNetAmount());

	}

}
