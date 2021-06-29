package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		List<Integer> myArrayList1 = new ArrayList<>();
		List<Integer> myArrayList2 = new ArrayList<>(List.of(50,60,70,80,90,100));
		List<Integer> myArrayList3 = new ArrayList<>(List.of(50,60));
		
		
		myArrayList1.add(20);
		myArrayList1.add(0, 10);//adding 10 at the index 0
		myArrayList1.addAll(1, myArrayList2);
		myArrayList1.contains(20);//returns true 
		myArrayList1.get(3);// return element at index 3
		myArrayList1.set(0, 11);// replace 10 with 11
		myArrayList1.remove(4);
		myArrayList1.removeAll(myArrayList3);
		
		//iteration using foreach loop
		for(var x : myArrayList1) {System.out.println(x);}
		
		//using for loop
		for(int i=0; i<myArrayList1.size(); i++) {System.out.println(myArrayList1.get(i));}
		
		//using Iterator
		//Forward Traversal
		Iterator<Integer> iterator = myArrayList1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+ " ");
		}
		
		//only applicable for List collection, ListIterator traverses both in forward and backward directions.
		//ListIterator can help to replace an element whereas Iterator cannot
		ListIterator<Integer> it = myArrayList1.listIterator();
		
		//Forward Traversal
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Backward Traversal
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		
		
		
	}

}
