package DSA_Topics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopK {
 public static void main(String[] args) {
	int arr[] = {1,1,1,2,2,3,5,5,5,5};
	int k = 2;
	Map<Integer,Integer> map = new HashMap<>();
	for(int num : arr) {
		map.put(num,map.getOrDefault(num,0)+1);
	}
	
	List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
	list.sort((a,b)-> b.getValue()-a.getValue());
	
	for(int i=0;i<k;i++) {
		System.out.println(list.get(i).getKey());
	}
	
}
}
