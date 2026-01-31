package hashMap;

// import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class HighestCountOfSumOfDigitsRange {
	
	// sum of digit calculation
	
	static int sumofdigits(int  num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num=num/10;
		}
		return sum;
	}	
	
	public static void main(String[] args) {

		Map<Integer,Integer> map=new HashMap<>();

		int arr[]= {15,5,8,9,4};

		
		// direct method
		// int min = Arrays.stream(arr).min().getAsInt();
        // int max = Arrays.stream(arr).max().getAsInt();
        
        int min = arr[0],max=arr[0];
		for(int i=1;i<arr.length;i++) {
			
			
			if(arr[i]<min) {
				min=arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
		// start from min to max take sum of digit and put into hashmap
		for(int i=min;i<=max;i++) {
			
			// for single digit dont calculate sum
			if(i/10==0) {
				map.put(i,map.getOrDefault(i,0)+1);
			}
			
			// double digit
			else {
				// digitsum store sum of digit
				int digitsum=sumofdigits(i);
				map.put(digitsum,map.getOrDefault(digitsum,0)+1);
			}
			
		}
		
	  // max count of values
		int maxcount=0;
		
		for(int count:map.values()) {
			maxcount=Math.max(maxcount, count);
		}
		System.out.println(maxcount);
		
		// iterate hasmap
		// (Map.Entry<itemtype,itemtype> new_refvar: oldmap_ref_var.entrySet()>)
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			if(entry.getValue()==maxcount) {
				System.out.print(entry.getKey()+" ");
			}
		}

	}

}
