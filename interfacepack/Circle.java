package interfacepack;

public class Circle implements Graphic,interface1,interface2 {
	float radius;
	
	public Circle(float radius) {
		
		this.radius = radius;
	}

	@Override
	public float calArea() {
		
		return PI*radius*radius;
	}

	@Override
	public float calPer() {
		
		return 2*PI*radius;
	}

	@Override
	public void fun1() {
		System.out.println("THIS IS MULTIPLE INHERITANCE");
		
	}

}
