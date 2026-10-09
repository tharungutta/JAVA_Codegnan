package CollectionsFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo1 {
   public static void main(String[] args) {
//	HashSet<String> set = new HashSet<>();
	   TreeSet<String> set = new TreeSet<>();
	   
	set.add("Hyderabad");
	set.add("secunderabad");
	set.add("vijayawada");
	set.add("Vizag");
	//set.add(null);   --> null values are not allowed in treeset
	set.add("Vizag");    // it will not allow duplicates, but here is no error , while printing it will print only one value
	System.out.println(set);     // insertion order is not maintained
	
	
//	Collections.sort(set);    --> It will support only in list
	
	
	// TreeSet ---> it will automatically sort the elements without using sort() method
	
}
}
