package DSA_Topics;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicates {
 public static void main(String[] args) {
	int arr[] = {10,20,30,20,20,40,30,50,40,20,30};
	
	Map<Integer,Integer> map = new HashMap<>();
	
	for(int num: arr) {
		map.put(num, map.getOrDefault(num,0)+1);
	}
	// find dupliactes
	for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+" "+entry.getValue()+"times");
		}
	}
	
}
}

