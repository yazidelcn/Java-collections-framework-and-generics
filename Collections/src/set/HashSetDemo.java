package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>(List.of(10,20,30,10,25,100,20));
		Set<Integer> myHashSet = new HashSet<>(myList);
		
		System.out.println(myHashSet);// prints [20, 100, 25, 10, 30] because set interface don't allow duplicate
	}
	
	
}
