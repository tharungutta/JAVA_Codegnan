package Java_8_Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class MyComparator_1 implements Comparator<Integer>{
//	
//	@Override
//	public int compare(Integer i1, Integer i2) {
//		if(i1<i2) {
//			return -1;
//		}else if(i1>i2){
//			return 1;
//		}else {
//			return 0;
//		}
//	}
//}


public class CustomSort {
    public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<>();
		 al.add(34);
		 al.add(23);
		 al.add(32);
		 al.add(18);
		 al.add(8);
		 
//		--------------- Normal Sorting-----------
//		 System.out.println(al);
//		 Collections.sort(al, new MyComparator_1());
//		 System.out.println(al);
		 
//		 ---------------with Lambda----------------
		 Comparator<Integer> x = (i1,i2)-> (i1>i2)? -1:(i1<i2)?1:0;
		 Collections.sort(al,x);
		 System.out.println(al);
	}
}
