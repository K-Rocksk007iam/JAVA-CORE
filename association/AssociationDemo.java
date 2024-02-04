package association;

public class AssociationDemo {

	public static void main(String[] args) {

		Bank bank = new Bank("ICICI", "NASHIK");

		Emp emp1 = new Emp("rahul", 450000);
		Emp emp3 = new Emp("aniket", 80000);
		Emp emp4 = new Emp("yash", 3400);
		Emp emp5 = new Emp("gary", 10000);

		System.out.println(emp1.getName() + " works at " + bank.getBankName() + "\nand earning " + emp1.getSal()
				+ " address is " + bank.getAddress());
		System.out.println("-----------------");

		System.out.println(emp3.getName() + " works at " + bank.getBankName() + "\nand earning " + emp3.getSal()
				+ " address is " + bank.getAddress());
		System.out.println("-----------------");
		System.out.println(emp4.getName() + " works at " + bank.getBankName() + "\nand earning " + emp4.getSal()
		+ " address is " + bank.getAddress());
		System.out.println("-----------------");
		System.out.println(emp5.getName() + " works at " + bank.getBankName() + "\nand earning " + emp5.getSal()
		+ " address is " + bank.getAddress());
	}

}
