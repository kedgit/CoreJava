package practise;

public class Binary_To_Decimal {

	public static void main(String[] args) {
		
		String binary="1101";
		int decimal=0;
		int power =0;
		for(int i=binary.length()-1;i>=0;i--) {
			
			// int digit=binary.charAt(i)-'0';
			 int digit= (int) binary.charAt(i);
			 decimal += digit * Math.pow(2,power);
			// decimal += Character.getNumericValue(binary.charAt(i))* Math.pow(2,power);
			 
			power++;
		}
		System.out.println(decimal);

	}

}
