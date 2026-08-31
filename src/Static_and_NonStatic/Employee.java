package Static_and_NonStatic;

 public class Employee {
    int empno ;    // instance or non-static variable
    float empsal;
    
    void display() {      // non-static method
    	System.out.println(empno);
    	System.out.println(empsal);
    }
}
