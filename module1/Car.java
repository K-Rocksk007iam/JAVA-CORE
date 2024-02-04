package module1;

public class Car 
{
	private int seatingCapacity;
	private String color;
	private int chasisNumber;
	private int cc;
	int price;
	
	public void setInformation(int sc,String c, int cn, int engincapacity)
	{
		seatingCapacity = sc;
		color = c;
		chasisNumber = cn;
		cc = engincapacity; 		
		
	}
	public void getInformation()
	{
		System.out.println("Car seatingCapacity : "+seatingCapacity);
		System.out.println("Car color : "+color);
		System.out.println("Car chasisNumber : "+chasisNumber);
		System.out.println("Car cc : "+cc);
		
	}
	
	public void features() {
		System.out.println("Electronic Parking Brake. ...\r\n"
				+ "360 View Camera. ...\r\n"
				+ "Automatic Parking Assist. ...\r\n"
				+ "Night Vision Assist. ...\r\n"
				+ "Adaptive Cruise Control. ...\r\n"
				+ "Cruise Control. ...");
	}
	
	public void setPrice(int pri) {
		price=pri;
		System.out.println("Price  : "+price);
	}
	
	public void setEnginePetrol() {
		
		System.out.println("Petrol");
	}
	
	public void setEngineDisel() {
		
		System.out.println("Petrol");
	}
	
	public static void main(String args[]) {
		Car obj=new Car();
		System.out.println("------------------------------------\n");
		obj.setInformation(4, "Black", 14321,800);
		obj.getInformation();
		obj.features();
		obj.setPrice(450000);
		
		Car obj1=new Car();
		System.out.println("------------------------------------\n");
		obj1.setInformation(6, "Blue", 17221,1200);
		obj1.getInformation();
		obj1.features();
		obj1.setPrice(950000);
		

	}
	
}

