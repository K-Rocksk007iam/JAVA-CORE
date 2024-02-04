package pen;

public class GelPointPen extends Pen {
	private String material;
	private String tip;

	public GelPointPen(String colour, String size, int price, String compName, String material, String tip) {
		super(colour, size, price, compName);
		this.material = material;
		this.tip = tip;
	}

	
	@Override
	public String toString() {
		return "GelPointPen [material=" + material + ", tip=" + tip + ", colour=" + colour + ", size=" + size
				+ ", price=" + price + ", compName=" + compName + "]";
	}

}
