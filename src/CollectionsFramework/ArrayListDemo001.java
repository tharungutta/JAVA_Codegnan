package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo001 {
  public static void main(String[] args) {
	ArrayList<String> countriesList = new ArrayList<String>();
	
	countriesList.add("India");
	countriesList.add("Japan");
	countriesList.add("Us");
	countriesList.add("Australia");
	
	System.out.println("Before calling sort method");
	for(String country: countriesList) {
		System.out.println(country);
	}
	
	//  sort
	
	
	Collections.sort(countriesList);
	
	System.out.println("After calling sort()");
	for(String country: countriesList) {
		System.out.println(country);
	}
	
	
	ArrayList<Integer> numList = new ArrayList<>();
	numList.add(10);
	numList.add(20);
	numList.add(5);
	numList.add(3);
	
	for(Integer num: numList) {
		System.out.println(num);
	}
	
	Collections.sort(numList);
	System.out.println("After sorting");
	for(Integer num: numList) {
		System.out.println(num);
	}
	
	
	
}
}
