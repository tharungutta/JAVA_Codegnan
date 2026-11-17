package DSA_Topics;

import java.util.HashMap;
import java.util.Map;

public class HashDemo {
	    public static void main(String[] args) {
	        Map<Integer,String> map = new HashMap<>();
	        map.put(123,"Tharun");
	        map.put(234,"Ramu");
	        map.put(345,"Boob");
	        System.out.println("Student details:"+map);
	        System.out.println("get based on key:"+map.get(123));
	        System.out.println("get key:"+map.containsKey(345));
	        System.out.println("get value:"+map.containsValue("Ramu"));
	        System.out.println("get KeyVAlue:"+map.getOrDefault(345,"No data"));
	        
         for(	Map.Entry<Integer,String> entry :map.entrySet()) {
        	    System.out.println(entry.getKey()+" "+entry.getValue());
         }

	    }
	
}
