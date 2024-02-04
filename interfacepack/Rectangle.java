package interfacepack;

public class Rectangle implements Graphic {
	int length, breadth;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float calArea() {

		return length * breadth;
	}

	@Override
	public float calPer() {
		return (length + breadth) * 2;
	}

	public void fun1() {
		System.out.println("THIS IS MULTIPLE INHERITANCE");

	}
}
