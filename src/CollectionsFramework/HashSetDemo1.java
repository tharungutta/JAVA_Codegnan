package CollectionsFramework;
import java.util.*;                     // Set --> it will not allow duplicates
public class HashSetDemo1 {
   public static void main(String[] args) {
	HashSet<String> set = new HashSet<>();
	
	set.add("Tharun");
	set.add("Ramu");
	set.add("Boob");
	set.add("Tharun");   // it will not allow duplicates, but here we written also no error while printing it will print one tharun.
	set.add(null);
	set.add(null);         // it Will allow only one null value.
	
	System.out.println(set);
	
	HashSet<Integer> set1 = new HashSet<>();
	set1.add(10);
	set1.add(5);
	set1.add(30);
	set1.add(20);
	
	System.out.println(set1);
}
}


// Insertion order is not maintained , it will print in different order.
// it uses hashTable data structure
// No duplicates + no Insertion order 