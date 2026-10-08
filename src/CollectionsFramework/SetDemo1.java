package CollectionsFramework;

import java.util.HashSet;

public class SetDemo1 {
   public static void main(String[] args) {
	HashSet<String> set = new HashSet<>();
	set.add("Hyderabad");
	set.add("secunderabad");
	set.add("vijayawada");
	set.add("Vizag");
	set.add(null);
	set.add("Vizag");    // it will not allow duplicates, but here is no error , while printing it will print only one value
	System.out.println(set);     // insertion order is not maintained
}
}
