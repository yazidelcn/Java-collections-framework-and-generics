package collectionsutils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(List.of(7,1,2,5,7,9,10));
		
		Collections.binarySearch(list, 2);// returns 1 (element at the index 2)
		Collections.sort(list);//[1, 2, 5, 7, 7, 9, 10]
		Collections.sort(list, new MyComparator());//sorting using customized comparator
		Collections.reverse(list);//revers the list ->[10, 9, 7, 5, 2, 1, 7]
		System.out.println(list);

	}

}
