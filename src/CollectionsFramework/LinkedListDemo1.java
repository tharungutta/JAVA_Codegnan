package CollectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo1 {
  public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	
	l1.add("RED");
	l1.add("ORANGE");
	l1.add("WHITE");
	l1.add("PINK");
	l1.add(1000);
	l1.add(null);
	
	System.out.println("The given objects are:"+l1);
	
	l1.addFirst("BLACK");
	l1.addLast("MAROON");
	
	Iterator it = l1.iterator();                        // using iterator we can print the values in forward direction only
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	ListIterator lit = l1.listIterator();               // Using ListIterator we can print values in both forward and backward direction
	System.out.println("In forwaerd direction");
	while(lit.hasNext()) {
		System.out.println(lit.next());
	}
	System.out.println("In backward direction");
	while(lit.hasPrevious()) {
		System.out.println(lit.previous());
	}
}
}
