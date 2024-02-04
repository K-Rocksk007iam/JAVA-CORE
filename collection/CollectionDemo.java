package collection;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		Emp emp = new Emp(1, "hunal", 2340000);

		list1.add("kunal");
		list1.add("tunal");
		list1.add("yunal");
		list1.add(10);
		list1.add("kunal");
		list1.add(30.5);
		list1.add('M');
		list1.add(true);
		list1.add(emp);

		// DISPLAY ALL
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("----------------------------------");

		// DISPLAY ALL USING ITERAtOR
		Iterator itr = list1.iterator();

		while (itr.hasNext()) { // true or false
			System.out.println(itr.next());
		}

		System.out.println("----------------------------------");
		list1.add("hello all");
		Iterator itr1 = list1.iterator();

		while (itr1.hasNext()) { // true or false
			System.out.println(itr1.next());
		}
		System.out.println("-------------TO REMOVE-------------------");
		System.out.println(list1.remove(0));
		System.out.println("---------------CONTAINS---------------");
		System.out.println(list1.contains("kunal"));
		System.out.println("-----------------INDEX OF--------------");
		System.out.println(list1.indexOf("kunal"));

		list1.add(0, "kun"); // add to particular index
		System.out.println("-----------GET THE ELEMENT AT GIVEN INDEX-----------------");
		System.out.println(list1.get(0));
		System.out.println("---------------INDEX OF----------------");
		System.out.println(list1.indexOf("kun"));
		System.out.println("---------------INDEX OF---------------");
		System.out.println(list1.indexOf("kunal"));
		System.out.println("--------------DISPLAY ALL----------------");
		Iterator itr2 = list1.iterator();

		while (itr2.hasNext()) { // true or false
			System.out.println(itr2.next());
		}
		System.out.println("---------------CLEAR AND IS EMPTY----------------");
		list1.clear();

		System.out.println(list1.isEmpty());

	}

}
