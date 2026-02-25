package practise;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		
		System.out.println("Enter Your String: ");
		Scanner str=new Scanner(System.in);
		
		String s=str.nextLine();
		// take empty map to put key and value as char and its count
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		// first convert string into char arrya to iterate
		for(char ch:s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0)+1);
		}

		// convert to entry set to iterate over
		// want all non repeating char remove break
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("First Non Repeating Char is: "+entry.getKey());
				break;
			}
		}
		
		// want iterate only keys use map.keySet
		for(Character key:map.keySet()) {
			System.out.println(key);
		}
		// want iterate only value use map.values
		for(Integer value:map.values()) {
			System.out.println(value);
		}
	}

}
