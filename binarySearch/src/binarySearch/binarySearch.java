package binarySearch;
import java.util.*;
public class binarySearch implements Comparable<binarySearch> {
	public static boolean binarySearchAlgo(List<Object> myList,int val ){
		if(myList.isEmpty()) {
			return false;
		}
		int mid = myList.size()/2;
		Object e = myList.get(mid);
		
		if(e.equals(val)) {
			return true;
		}
		else if(e) {
			return binarySearchAlgo(myList.subList(mid, myList.size()),val);
		}
	}

	@Override
	public int compareTo(binarySearch o) {
		// TODO Auto-generated method stub

	}

	
}
