package Static_and_NonStatic;

public class Employee_Main {
   public static void main(String[] args) {
	Employee e1 = new Employee();  // object creation
	e1.empno = 100;           // assigning values using object reference
	e1.empsal = 10000.34f;
	e1.display();                //calling display method of different method using object reference
}
}
