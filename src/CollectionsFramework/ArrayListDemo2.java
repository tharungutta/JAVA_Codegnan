package CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo2 {
    public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		System.out.println("Intial size:"+a1.size());
	
		a1.add("Tharun");
		a1.add("Teja");
		a1.add("Ramu");
		a1.add("300");
		a1.add(200);
		a1.add(true);
		a1.add("Tharun");
		a1.add(null);
		System.out.println(a1);
		System.out.println("final size :"+a1.size());
		System.out.println("final capacity:");
		
		System.out.println(a1.contains("Teja"));
		System.out.println(a1.get(0));
		System.out.println(a1.isEmpty());
        System.out.println(a1.remove(6));		
        
		ArrayList a2 = new ArrayList();
//		Arrays.asList("Tharun", "Teja","Ramu");
		a2.add("Tharun");
		a2.add("Teja");
		a2.add("Ramu");
		System.out.println(a2);
		
//		a1.addAll(a2);
//		System.out.println(a1);
//		a1.removeAll(a2);
//		System.out.println(a1);
		a1.retainAll(a2);
		System.out.println(a1);

		
	}
}
