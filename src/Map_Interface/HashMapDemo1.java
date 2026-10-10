package Map_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo1 {
   public static void main(String[] args) {
	   
	HashMap<Integer,String> hMap = new HashMap<>();
	
	hMap.put(101,"Tharun");
	hMap.put(102, "Ramu");
	hMap.put(103, "Karim");
	hMap.put(104,"Boob");
	
	System.out.println(hMap);
	System.out.println(hMap.get(101));
	System.out.println(hMap.keySet());
	System.out.println(hMap.values());
	
	for(Map.Entry<Integer, String> entry : hMap.entrySet()) {
		System.out.println(entry.getKey()+" |"+entry.getValue());
	}
}
}
