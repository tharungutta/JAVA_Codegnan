package CollectionsFramework;
import  java.util.*;
public class LinkedHashSetDemo1 {
   public static void main(String[] args) {
	 LinkedHashSet<String> set = new LinkedHashSet<>();
	 
	  set.add("Tharun");
	  set.add("Ramu");
	  set.add("Boob");
	  set.add("Tharun");     // duplicates are not allowed
	  set.add(null);         // aloows one null value
	  
	  System.out.println(set);
	  
	  LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		set1.add(10);
		set1.add(5);
		set1.add(30);
		set1.add(20);
		
		System.out.println(set1);
	 
	  
}
}


// insertion order is maintained , how we write it will print same 
// It uses Hash table + linked list data Structure
// No duplicates + Insertion order is maintained