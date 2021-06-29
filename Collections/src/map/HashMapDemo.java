package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Java");
		map.put(2, "Javascript");
		map.put(3, "Python");
		map.put(4, "C++");
		map.put(5, "C#");
		//keys must be unique since its a set
		Set<Integer> set = map.keySet();// returns the keys
		Collection<String> collection = map.values();// returns the values

		for (int key : set) {
			System.out.println("Key :" + key+" value :"+map.get(key));
		}

	}

}
