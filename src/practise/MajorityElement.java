package practise;

import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		
		// element > arr.length/2
		// 1 > 7/2
		int arr[]= {2,1,1,4,1,3,1};
		int majoritylength=arr.length /2;
		Map<Integer,Integer> map=new LinkedHashMap<>();
		
		// put with index
//		for(int i=0;i<arr.length;i++) {
//			map.put(i, arr[i]);
//		}
		
		for(int num:arr) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			if( majoritylength < entry.getValue()) {
				
				System.out.println(entry.getKey());
			}
		}
		
		System.out.println(majoritylength);
	}

}
