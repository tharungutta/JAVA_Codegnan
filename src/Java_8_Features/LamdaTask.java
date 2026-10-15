package Java_8_Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class MyComparator implements Comparable{
//	public int compare(int i1, int i2) {
//		if(i1<i2) {
//			return -1;
//		}else if(i1>i2) {
//			return 1;
//		}else {
//			return 0;
//		}
//	}
//}

public class LamdaTask {
   public static void main(String[] args) {
	ArrayList l1 = new ArrayList();
	l1.add(10);
	l1.add(6);
	l1.add(8);
	l1.add(7);
	
//	Collections.sort(l1);
//	System.out.println(l1);
	Comparator<Integer> c = (i1, i2) -> (i1<i2)? -1:(i1<i2)?1:0;
	Collections.sort(l1,c);
	System.out.println(l1);
	
}
}
