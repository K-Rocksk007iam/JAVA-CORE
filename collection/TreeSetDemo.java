package collection;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(10);
		tree1.add(20);
		tree1.add(300);
		tree1.add(400);
		tree1.add(30);
		tree1.add(30);
		tree1.add(40);
		tree1.add(50);
		tree1.add(50);
		tree1.add(50);

		Iterator itr = tree1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------------------");
		System.out.println(tree1.first() + "   first");
		System.out.println(tree1.last() + "  Last");

	}

}
