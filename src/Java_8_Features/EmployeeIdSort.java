package Java_8_Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int id;
	String name;
	public Employee() {
		
	}
	public Employee(int i, String name) {
		this.id = i;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
public class EmployeeIdSort {
   public static void main(String[] args) {
	ArrayList<Employee> al = new ArrayList<>();
	al.add(new Employee(123,"Tharun"));
	al.add(new Employee(124,"Tarun"));
	al.add(new Employee(120,"arun"));
	al.add(new Employee(121,"run"));
//	System.out.println(al);
	
	//---------------With lambda------------
	Comparator<Employee> c = (e1, e2)-> (e1.id<e2.id)? -1:(e1.id>e2.id)?1:0;
	Collections.sort(al,c);
	System.out.println(al);
}
}
