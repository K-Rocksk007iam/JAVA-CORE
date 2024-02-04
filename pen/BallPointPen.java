package pen;

public class BallPointPen extends Pen {
	private int width;
	private String ink;

	public BallPointPen(String colour, String size, int price, String compName, int width, String ink) {
		super(colour, size, price, compName);
		this.width = width;
		this.ink = ink;
	}

	

	@Override
	public String toString() {
		return "BallPointPen [width=" + width + ", ink=" + ink + ", colour=" + colour + ", size=" + size + ", price="
				+ price + ", compName=" + compName + "]";
	}

}
