package practise;
import java.util.Scanner;

public class Decimal_To_Binary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		// first approach
		String bin="";
		
//		while(num>0) {
//			int rem=num%2;
//			bin=rem+bin;
//			num/=2;
//		}
		// second approach
		String bin1=Integer.toBinaryString(num);

		System.out.println("Binary for "+num+" is:"+bin1);
	}

}
