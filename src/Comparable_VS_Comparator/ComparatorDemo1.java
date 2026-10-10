package Comparable_VS_Comparator;
import java.util.*;
public class ComparatorDemo1 {
   int age;
   String name;
   ComparatorDemo1(int age , String name){
	   this.age = age;
	   this.name = name;
   }
   @Override
   public String toString() {
	   return age+" "+name;
   }
}

class NameComparator implements Comparator<ComparatorDemo1>{
	@Override
	public int compare(ComparatorDemo1 c1, ComparatorDemo1 c2) {
		return c1.name.compareTo(c2.name);
	}
}

class ComparatorMain{
	public static void main(String[] args) {
		ArrayList<ComparatorDemo1> list = new ArrayList<>();
		
		list.add(new ComparatorDemo1(22,"Tharun"));
		list.add(new ComparatorDemo1(20,"Ramu"));
		list.add(new ComparatorDemo1(22,"Boob"));
		
		Collections.sort(list, new NameComparator());
		System.out.println(list);
	}
}