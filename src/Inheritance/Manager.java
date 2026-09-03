package Inheritance;

public class Manager extends Employee {
  protected float ta, da;
  Manager(){
	  ta = 1200.45f;
	  da = 1500.43f;
	  System.out.println("This is sub class Manager non-paramerized  constructor");
  }
  Manager( float f1, float f2){
	  super(123, 456.75f);   // calling super class parameterized method
	  ta = 1200.45f;
	  da = 1500.43f;
	  System.out.println("This is sub class Manager parameterized constructor");
  }
  void calculateSalary() {
	  float netSal = empsal+ta+da;
	  System.out.println("The net sal value is :"+netSal);
  }

}

