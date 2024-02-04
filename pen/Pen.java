package pen;

public class Pen {
	protected String colour;
	protected String size;
	protected int price;
	protected String compName;
	
	public Pen(String colour, String size, int price, String compName) {
		super();
		this.colour = colour;
		this.size = size;
		this.price = price;
		this.compName = compName;
	}
	
	protected void writing() {
		System.out.println("Writing from pen class");
	}
	
	protected void highlighting() {
		System.out.println("highlighting from pen class");
	}
	
	protected void marking() {
		System.out.println("marking from pen class");
	}

	@Override
	public String toString() {
		return "Pen [colour=" + colour + ", size=" + size + ", price=" + price + ", compName=" + compName + "]";
	}
	
}
