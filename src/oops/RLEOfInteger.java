package oops;

class runlengthencoding{
	public String first(int n) {
		String s="1";
		for(int i=1;i<n;i++) {
			s=second(s);
		}
		return s;
	}
	public String second(String s) {
		StringBuilder sb=new StringBuilder();
		
		int count=1;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
			}
			else {
				sb.append(count).append(s.charAt(i-1));
			}
		}
		sb.append(count).append(s.charAt(s.length()-1));
		return sb.toString();
	}
}
public class RLEOfInteger {

	public static void main(String[] args) {
		runlengthencoding r=new runlengthencoding();
		int num=5;
		String res=r.first(num);
		System.out.println(res);
		
	}

}
