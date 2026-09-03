package Inheritance;

public class Single_main {
 public static void main(String[] args) {
	Manager m1 = new Manager();   // sub class object
	m1.display();     // calling super class method
	m1.calculateSalary();  // calling sub class method
	Manager m2 = new Manager(1100.23f,1400.34f);
	m2.display();
	m2.calculateSalary();                             // The object will call the non parameterized of sub class , the sub class will call the non parameterized of
	                                                   // super class. sub class only call the non- parameterized
}
}
