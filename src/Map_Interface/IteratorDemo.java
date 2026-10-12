package Map_Interface;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
  public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("Tharun");
	al.add("Ramu");
	al.add("Boob");
	al.add("Karim");
	
	// using for loop
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	System.out.println("**************");
	
	//using enhanced for loop
	for(String s: al) {
		System.out.println(s);
	}
	
	System.out.println("***********");
	
	// using iterator
	Iterator<String> il = al.iterator();
	
	// remove()
	
	while(il.hasNext()) {
		String element = il.next();
		if(element.equals("Tharun")) {
			il.remove();
		}
	}
	System.out.println(al);

	
}
}
