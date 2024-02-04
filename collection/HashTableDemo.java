package collection;
import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> table= new Hashtable<>();
		table.put(1,"kunal");
		table.put(8,"kkunal");
		table.put(2,"yunal");
		table.put(2,"yunal");
		table.put(2,"yunal");
		table.put(3,"tunal");
		table.put(4,"hunal");
		table.put(5,"punal");
		table.put(6,"vunal");
		
		System.out.println(table);
		System.out.println(table.get(1));
		System.out.println(table.isEmpty());
		System.out.println(table.contains(table));
		System.out.println(table.hashCode());
		System.out.println(table.size());
		System.out.println(table.remove(1));
		System.out.println(table.get(1));
		
		
	

	}

	}


