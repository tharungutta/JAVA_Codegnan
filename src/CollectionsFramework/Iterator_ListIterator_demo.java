package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_ListIterator_demo {
    public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("Tharun");
		al.add("Ramu");
		al.add("Maheboob");
		al.add("Karri");
		
		System.out.println(al);
		
//		Iterator<String> itr = al.iterator();          // using iterator we can print only in forward direction
//		
//		while(itr.hasNext()) {
//			if(itr.next().contains("Ramu")) {
//				itr.remove();
//			}
//		}
//		for(String names : al) {
//			System.out.println(names);
//		}
		
		ListIterator<String> ltr = al.listIterator();
		
		while(ltr.hasNext()) {
			if(ltr.next().contains("Karri")) {
				ltr.set("Syed");
			}
		}
		for(String name: al) {
			System.out.println(name);
		}
	   System.out.println("----------------In reverse direction------------");
		
	   while(ltr.hasPrevious()) {
		   System.out.println(ltr.previous());
	   }
	}
}
