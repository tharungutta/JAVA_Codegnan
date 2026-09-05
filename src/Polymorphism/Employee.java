package Polymorphism;
                                           // Method Overriding
public class Employee {
   protected int empId;
   protected float empsal;
   
   Employee(){
	   empId = 1000;
	   empsal = 100000.0f;
	   System.out.println("This is super class employee constructor");
   }
   void calSal() {            // overridden method
	   System.out.println("The sal of an employee : "+empsal);
   }
}
