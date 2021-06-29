package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {
		
		Random obj = new Random();
		
		//does not maintain the order in which the elements are added to the set 
		//HashSet<Integer> set = new HashSet<>();
		//maintain the exact order in which the elements are added 
		//LinkedHashSet<Integer> set = new LinkedHashSet<>();
		//sort the elements
		  TreeSet<Integer> set = new TreeSet<>();
		
		for(int i=1; i<=5; i++) {
			int number = obj.nextInt(100);
			set.add(number);
			System.out.print(number + " ");
		}
		
		System.out.println(set);
		
	}

}
