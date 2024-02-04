package interfacepack;

public class TestGraphic {

	public static void main(String[] args) {
		Circle circle= new Circle(6);
		System.out.println("area is : "+circle.calArea());
		System.out.println("perimeter is : "+circle.calPer());
		circle.fun1();
		
		System.out.println("--------------------------------");
		 
		Rectangle rect = new Rectangle(4, 5);
		System.out.println("area is : "+rect.calArea());
		System.out.println("perimeter is : "+rect.calPer());
		rect.fun1();
	}

}
