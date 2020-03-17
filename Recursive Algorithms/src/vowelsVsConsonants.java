import java.util.*;
public class vowelsVsConsonants {

	public static void main(String[] args) {
		String s = "ara";
		System.out.println(vOrC(s));

	}
	
	public static boolean vOrC(String s) {
		int i = 0;
		int numC = 0;
		int numV = 0;
		return vOrCHelper(s,i,numC,numV);
	}
	
	public static boolean vOrCHelper(String s, int i,int cons, int vow) {
		if(i == s.length() && (cons >= vow)) {
			return false;
		}
		else if(i == s.length() && (cons < vow)) {
			return true;
		}
		if(isVowel(s.charAt(i))) {
			vow++;
		}
		else {
			cons++;
		}
		return vOrCHelper(s,++i,cons,vow);
	}
	
	
	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ;
	}

}
