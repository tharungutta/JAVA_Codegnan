package DSA_Topics;

import java.util.HashMap;
import java.util.Map;

public class FIrstNonRepeatingChar {
  public static void main(String[] args) {
	String s = "sleeping";
	
	Map<Character,Integer> map = new HashMap<>();
	
	//Convert characters and count frequency
	for(char ch : s.toCharArray()) {
		map.put(ch,map.getOrDefault(ch,0)+1);
	}
	// first non repeat
	for(int i=0;i<s.length();i++) {
		if(map.get(s.charAt(i))==1) {
			System.out.println("index:"+i);
			return;
		}
	}
	System.out.println("none");
}
}
