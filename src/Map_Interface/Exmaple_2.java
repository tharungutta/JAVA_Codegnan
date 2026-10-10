package Map_Interface;
// frequency of word
import java.util.*;
public class Exmaple_2 {
   public static void main(String[] args) {
	 String res = "Hyderabad";
	 char []ch = res.toCharArray();
	 HashMap<Character, Integer> hmap = new HashMap<>();
	 for(char x: ch) {
		 hmap.put(x,hmap.getOrDefault(x,0)+1 );
	 }
	 for(Map.Entry<Character,Integer> entry : hmap.entrySet()) {
		 System.out.println(entry.getKey()+" = "+entry.getValue());
	 }
	 
}
}
