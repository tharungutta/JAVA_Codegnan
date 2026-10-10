package Map_Interface;
// frequency of numbers in an array using HashMap
import java.util.*;
public class Example_1 {
   public static void main(String[] args) {
	  int []a = {10,20,20,10,3,4,5,3,2,4,3};
	  
	  HashMap<Integer, Integer> hmap = new HashMap<>();
	  
	  for(int num : a) {
		  hmap.put(num, hmap.getOrDefault(num, 0)+1);
	  }
	  for(Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
		 System.out.println(entry.getKey()+" = "+entry.getValue());
	  }
}
}
