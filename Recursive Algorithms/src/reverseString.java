
public class reverseString {

	public static void main(String[] args) {
		String s = "jorra";
		System.out.println(revString(s));
	}
	
	public static String revString(String s) {
		String tmp = "";
		int i = 0;
		int j = s.length() -1;
		
		return revStringHelper(s,tmp,j);
	}
	
	public static String revStringHelper(String s,String temp, int j) {
		if(j < 0 ) {
			return temp;
		}
		temp += s.charAt(j);
		return revStringHelper(s,temp,j-1);
	}
}
