
public class isPalindromeRec {

	public static void main(String[] args) {
		String s = "racecar";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() -1;
		
		return isPalindromeHelper(s,i,j);
	}
	
	public static boolean isPalindromeHelper(String s, int i , int j) {
		if( i > j) {
			return true;
		}
		if(s.charAt(i) != s.charAt(j)) {
			return false;
		}
		return isPalindromeHelper(s,++i,--j);
	}

}
