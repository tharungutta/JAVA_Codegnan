package Java_8_Features;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.*;

public class PredifinedFunc_1 {
  
	int id;
	int age ;
	double sal;
	String name; 
	
	public PredifinedFunc_1() {
		
	}
	public PredifinedFunc_1(int id, int age, double sal, String name) {
		this.id = id;
		this.age = age;
		this.sal = sal;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class EmployeeMain{
	public static void main(String[] args) {
		PredifinedFunc_1 emp = new PredifinedFunc_1(1, 22, 50000, "Tharun");
		
		// Age eligibility
		Predicate<PredifinedFunc_1> eligible = a -> a.getAge()>=18;
		System.out.println("Is Eligible:"+eligible.test(emp));
		
		// Annual Sal
		Function<PredifinedFunc_1, Double> aSal = a -> a.getSal()*12;
	    System.out.println("Annual Sal:"+aSal.apply(emp));

	    // Print all emp details
	    Consumer<PredifinedFunc_1> printDetails = a -> {
	    	System.out.println("Employee id:"+emp.getId());
	    	System.out.println("Employee Age:"+emp.getAge());
	    	System.out.println("Employee Sal:"+emp.getSal());
	    	System.out.println("Employee Name:"+emp.getName());
	    };
	    printDetails.accept(emp);
	    
		//display default department
		Supplier<String> dept = ()-> "IT Dept";
		System.out.println("Department:"+dept.get());
	}
}
