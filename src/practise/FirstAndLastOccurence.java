package practise;

import java.util.Arrays;

public class FirstAndLastOccurence {

	 static int[] indexofelement(int[] arr, int target) {
		int left=0;
		int right=arr.length-1;
		int mid;
		int result1 = -1;
		int result2 = -1;
		
		while(left<=right) {
			mid=left+(right-left)/2;
			
			if(arr[mid]==target) {
				result1=mid;
				right=mid-1;
			 
			}
			else if(arr[mid]<target) {
				left=mid+1;
				
			}
			
			else {
				
				right=mid-1;
			}
		}
		
		int left1=0;
		int right1=arr.length-1;
		int mid1;
		while(left1<=right1) {
			
			 mid1= left1 + (right1-left1)/2;
			if(arr[mid1]==target) {
				result2=mid1;
				left1=mid1+1;
			}
			else if(arr[mid1]<target) {
				left1=mid1+1;
			}
			else {
				right1=mid1-1;
			}
		}
		
		return new int [] {result1,result2};
	}
	
	public static void main(String[] args) {
		
		int arr[]= {12,12,12,12,12,23};
		int target=12;
		
		int res[]=indexofelement(arr,target);
		System.out.println(Arrays.toString(res));
		
	}

	

}
