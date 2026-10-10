package Map_Interface;
import java.util.*;
public class HashMapDemo2 {
  public static void main(String[] args) {
	  
	  Student st1 = new Student(100,"Tharun",22);  // A
	  Student st2 = new Student(101,"Ramu",21);    //B
	  Student st3 = new Student(102,"Karim",26);   // F
	  
	HashMap<Character, Student> hmap = new HashMap<>();
	
	hmap.put('A', st1);
	hmap.put('B', st2);
	hmap.put('F', st3);
	
	for(Map.Entry<Character,Student> entry : hmap.entrySet()) {
		System.out.println(entry.getKey()+" | "+entry.getValue().getName());
	}
	
}
}
