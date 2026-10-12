package Map_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {
   public static void main(String[] args) {
	   ArrayList<String> al = new ArrayList<>();
		al.add("Tharun");
		al.add("Ramu");
		al.add("Boob");
		al.add("Karim");
		
	  //listIterator()
        ListIterator<String> litr =  al.listIterator();  
        
        System.out.println("*************Forward********");
        while(litr.hasNext()) {
        	System.out.println(litr.next());
        }
        
        System.out.println("*********Backward**********");
        while(litr.hasPrevious()) {
        	System.out.println(litr.previous());
        }
}
}
