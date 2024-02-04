package abstracrpack;

abstract class Animal {
	protected int legs = 4;

	protected void classInfo(String type) {
		System.out.println("\n\tANIMAL : " + type+"\n");
	}
	protected void nameOfAnimal(String type) {
		System.out.println("ANIMAL name: " + type);
	}

	abstract void sound();

	abstract void eat();

	abstract void tail();
}

class Dog extends Animal {

	void sound() {
		System.out.println("BARK");

	}

	void eat() {
		System.out.println("Eats nonveg and veg");

	}

	void tail() {
		System.out.println("tail : YES");

	}

}

class Lion extends Animal {

	void sound() {
		System.out.println("ROAR");

	}

	void eat() {
		System.out.println("Eats nonveg");

	}

	void tail() {
		System.out.println("tail : YES");

	}

}

public class AnimalTest {

	public static void main(String[] args) {

		Dog labra = new Dog();
		labra.classInfo("DOG");
		labra.nameOfAnimal("GOLDY");
		labra.eat();
		labra.sound();
		labra.tail();
		System.out.println("-----------------------------");
		Lion simba = new Lion();
		simba.classInfo("LION");
		simba.nameOfAnimal("SIMBA");
		simba.sound();
		simba.eat();
		simba.tail();

	}

}
