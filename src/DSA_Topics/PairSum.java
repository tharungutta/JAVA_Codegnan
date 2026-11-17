package DSA_Topics;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
 public static void main(String[] args) {
	int arr [] = {2,7,11,15};
	int target = 9;
	
	//empty map
	Map<Integer,Integer> map = new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		//findout compliment
		int complement = target-arr[i];
		if(map.containsKey(complement)) {
			System.out.println("found a pair");
			System.out.println("Indexs are:"+map.get(complement)+" "+i);
			return;
		}
		map.put(arr[i], i);
	}
	System.out.println("No pair found");
}
}
