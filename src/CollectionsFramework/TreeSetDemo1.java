package CollectionsFramework;
import java.util.*;
public class TreeSetDemo1 {
   public static void main(String[] args) {
	  TreeSet<String> set = new TreeSet<>();
	  
	  set.add("Tharun");
	  set.add("Ramu");
	  set.add("Boob");
	  set.add("Tharun");    // duplicates are not allowed
	 //  set.add(null);     // it will not allow one null value also for sorting null should be not there.
	  
	  System.out.println(set);
	  
	  TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(10);
		set1.add(5);
		set1.add(30);
		set1.add(20);
		
		System.out.println(set1);
}
}

// it gives the output by sorting, without using the sort() method.
// it uses tree( Red-Black Tree) data Structure.
// No duplicates + Sorted Order
