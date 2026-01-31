package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// maintain insertion order
// allow duplicates
// itterate and delete through itterator
// arrayList - linkedList - vector

public class Listi {

	public static void main(String[] args) {
		
		// dynamicaly add element due to ArrayList 
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		 list.add(8);
		
		// convert into Iterator
		// iterate and delete concurrently
		
		Iterator<Integer> it= list.iterator();
		
		// hashNext check element is present or not
		while(it.hasNext()) {
			
			// target to current element
			int n=it.next();
			
			if(n%2==1)
				it.remove();
		}
		
		System.out.println(list);
		
		// Perfect for read-only operations
		list.forEach(System.out::println);

	}

}
