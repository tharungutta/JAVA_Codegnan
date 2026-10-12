package Map_Interface;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
   public static void main(String[] args) {
	Vector<String> v = new Vector<>();
	v.add("Tharun");
	v.add("Ramu");
	v.add("Boob");
	v.add("Karim");
	
	for(String s : v) {
		System.out.println(s);
	}
	
	System.out.println("******************************");
	
	//Enumeration cursor   --> it is used in legacy classes only and it retrive in only in forward direction
	
	Enumeration<String> en = v.elements();
	
	   
	while(en.hasMoreElements()){               //  hasMoreElements --> to check elements present in enumeration or not, it returns boolean value.
		System.out.println(en.nextElement());    // nextElement()  --> to print the elements present in the enumeration.
	}
	
}
}
