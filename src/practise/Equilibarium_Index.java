package practise;

import java.util.Arrays;
import java.util.Scanner;

public class Equilibarium_Index {

	public static void main(String[] args) {
		
		int equ=-1;
		System.out.println("Enter how much element want in array: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int totalsum=0;
		for(int i=0;i<n;i++) {
			totalsum+=arr[i];
		}
		
		int leftsum=0;
		for(int i=0;i<n;i++) {
			totalsum-=arr[i];
			if(leftsum==totalsum) {
				equ=i;
				break;
			}

			leftsum+=arr[i];
		}
		
		System.out.println(equ);

	}

}
