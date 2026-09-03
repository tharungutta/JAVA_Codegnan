package Inheritance;

public class Employee {
  protected int empno;
  protected float empsal;
  Employee(){
	  empno = 1000;
	  empsal = 1000.90f;
	  System.out.println("This is super class non parametized constructor");
  }
  Employee(int e1, float f1){
	  empno = 1000;
	  empsal = 1000.90f;
	  System.out.println("This is super class paramerized constructor");
  }
  void display() {
	  System.out.println("The emp no is :"+empno);
	  System.out.println("The emp empsal is :"+empsal);
  }
}
