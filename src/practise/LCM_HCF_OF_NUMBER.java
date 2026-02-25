package practise;

public class LCM_HCF_OF_NUMBER {
	
	public static int gcd(int a,int b) {
		while(b!=0) {
		int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}

	public static void main(String[] args) {
	
		int number1=4;
		int number2=5;
		
		// approach 1 find by gcd
		int lcm=(number1*number2)/gcd(number1,number2);
		
		// approach 2 find max 
		int max=Math.max(number1,number2);
		int lcm1=max;
		while(true) {
			if(lcm1%number1==0 && lcm1%number2==0) {
				break;
			}
			lcm1++;
		}
		
		System.out.println(lcm1);
	}

}
