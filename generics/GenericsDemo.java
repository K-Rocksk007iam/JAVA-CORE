package generics;

class TestClass{
	public <E> void printArray(E[] array1) {
		for(E i:array1) {
			System.out.println(i);
		}
	}
}

public class GenericsDemo {

	public static void main(String[] args) {
		TestClass obj = new TestClass();
		Integer[] intarr= {11,22,33,44};
		obj.printArray(intarr);
		System.out.println("-------------------------");
		Float[] floatarr= {1.1f,2.2f,3.3f,4.4f};
		obj.printArray(floatarr);
		System.out.println("-------------------------");
		Double[] doublearr= {11.1,22.2,33.3,44.4};
		obj.printArray(doublearr);
		System.out.println("-------------------------");
		String[] stringarr= {"kun","faya","kun"};
		obj.printArray(stringarr);
		System.out.println("-------------------------");
		Character[] chararr= {'A','B','C'};
		obj.printArray(chararr);

	}

}
