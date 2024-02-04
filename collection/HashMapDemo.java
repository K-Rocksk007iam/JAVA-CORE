package collection;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Character, String> map= new HashMap<>();
		map.put('M', "KUNAL");
		map.put('a', "KUN");
		map.put('A', "KUNAL");
		map.put('M', "tUNAL");
		map.put('m', "tUNAL");
		map.put('F', "nuNAL");
		map.put('F', "yuNAL");
		map.put('f', "KUNAL");
		
		map.put(null, "KAL");
		
		map.put('Q', null);
		map.put(null, null);
		
		map.putIfAbsent('K', "kkk");
		map.putIfAbsent('K', "kuk");
		
		System.out.println(map);
		
		//get all keys
		Object[] keys=map.keySet().toArray();
		
		for(int i=0;i<keys.length;i++) {
			System.out.println(keys[i]+" ");
		}
				
		System.out.println("-----------------------------");
		System.out.println(map.get('M'));
		System.out.println("-----------------------------");
		System.out.println(map.containsKey('M'));
		System.out.println("-----------------------------");
		System.out.println(map.remove('a'));
		System.out.println("-----------------------------");
		System.out.println(map.isEmpty());
		System.out.println("-----------------------------");
		map.clear();
		System.out.println(map.isEmpty());
		
		
		
	}

}
