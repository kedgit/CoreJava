package collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Sett {
	
	public static void main(String[] args) {
		
		// unique + null
		Set<String> set=new HashSet<>();
		
		set.add("apple");
		set.add("cat");
		set.add(null);
		set.add("banana");
			
		System.out.println(set);
		
		// unique + null + insertion order
		Set<String> set1=new LinkedHashSet<>();
		
		set1.add("apple");
		set1.add("cat");
		set1.add(null);
		set1.add("banana");
			
		System.out.println(set1);
		
		
		// unique + not null + sort
		Set<String> set2=new TreeSet<>();
		
		set2.add("apple");
		set2.add("cat");
		// set2.add(null);
		set2.add("banana");
			
		System.out.println(set2);

	}

}
