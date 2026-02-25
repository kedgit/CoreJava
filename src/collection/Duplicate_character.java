package collection;

public class Duplicate_character {

	public static void main(String[] args) {
		
		String s="ibbcici";
		StringBuilder sb=new StringBuilder();
		
		for(char c:s.toCharArray()) {
			int len=sb.length();
			if(len>0 && sb.charAt(len-1)==c) {
				sb.deleteCharAt(len-1);
			}
			else {
				sb.append(c);
			}
		}
		
		System.out.println(sb);
	}

}
