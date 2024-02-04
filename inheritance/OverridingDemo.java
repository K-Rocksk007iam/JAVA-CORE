package inheritance;

class Shape {
	public void calArea(String str, int a, int b) {
		System.out.println("Cal area of shape class ");
	}

	public void display() {
		System.out.println("display of shape class ");
	}
}

class Reactangle extends Shape {
	public void calArea(String str, int a, int b) {
		System.out.println("Cal area of reactangle class ");
		System.out.println("the area is : "+(a*b));
	}

	public void display() {
		super.display();
	}
}



public class OverridingDemo {
	public static void main(String args[]) {
		Shape sh=new Shape();  // compile time poly
		sh.calArea(" ", 0, 0);
		sh.display(); 
		System.out.println("------------------------------");
		
		Reactangle rect=new Reactangle();  // compile time poly
		rect.calArea("rect", 4, 21);
		rect.display();
		System.out.println("------------------------------");
		
		sh=new Reactangle();  //runtime poly
		sh.calArea("rectangle", 10, 12);
		sh.display();
		System.out.println("------------------------------");
		
		
	}
}
