package module3;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Circle circle1 = new Circle();
		Circle circle12 = new Circle();
		
		System.out.println(circle.hashCode());
		System.out.println(circle1.hashCode());
		System.out.println(circle12.hashCode());
		
		circle.accept();
		circle.calArea();
		circle.calPerimeter();
		circle.display();

	}

}
