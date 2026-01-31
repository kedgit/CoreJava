package collection;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class Mapp {

	public static void main(String[] args) {
		
		// Backed by hash table, no order, allows null key & null values, fast 
		
		Map<Integer,String > map= new HashMap<>();
		
		
		map.put(1002, null);
		map.put(1000, "shersha");
		map.put(999, "dishan");
		map.put(1001,"kedar");
		map.put(null, "null");

		
		System.out.println(map);
		
		// no null key but value allow , sorted , 
		Map<Integer,String > map1= new TreeMap<>();
		
		map1.put(1001,"kedar");
		map1.put(1002, null);
		map1.put(1000, "shersha");
		map1.put(999, "dishan");
		
		
		System.out.println(map1);
		
		
		// order + allow null
		
		Map<Integer,String > map2= new LinkedHashMap<>();
		
		map2.put(1001,"kedar");
		map2.put(1002, null);
		map2.put(1000, "shersha");
		map2.put(null, "dishan");
		
		
		System.out.println(map2);

	}

}
