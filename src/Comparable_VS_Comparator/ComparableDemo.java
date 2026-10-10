package Comparable_VS_Comparator;
import java.util.*;
public class ComparableDemo implements Comparable<ComparableDemo> {
    int age ;
    String name;
    ComparableDemo(int age , String name){
    	this.age = age;
    	this.name = name;
    }
    @Override
    public String toString() {
    	return age+" "+name;
    }
    @Override 
    public int compareTo(ComparableDemo cd) {
    	return this.age - cd.age;
    }
}

class ComparableMain{
	public static void main(String[] args) {
		ArrayList<ComparableDemo> list = new ArrayList<>();
		list.add(new ComparableDemo(22,"Tharun"));
		list.add(new ComparableDemo(20,"Ramu"));
		list.add(new ComparableDemo(24,"boob"));
		
		Collections.sort(list);
		System.out.println(list);
	}
}
