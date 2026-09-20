package OopsTask_Practice;

public class Person {
   String name;
   Person(String name){
	   this.name = name;
   }
   void display() {
	   System.out.println("Name:"+name);
   }
}
class Employee extends Person{
	int employeeId;
	double sal;
	Employee(int employeeId, double sal){
		super("Tharun");
		this.employeeId = employeeId;
		this.sal = sal;
	}
	void show() {
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Salary:"+sal);
	}
}
class Developer extends Employee{
	String pl;
	int exp;
	Developer(String pl, int exp){
		super(100, 100000.0);
		this.pl = pl;
		this.exp = exp;
	}
	void display1() {
		System.out.println("Progamming lang:"+pl);
		System.out.println("Experience:"+exp);
	}
	public static void main(String[] args) {
		Developer d1 = new Developer("java",10);
		d1.display();
		d1.show();
		d1.display1();
	}
}
