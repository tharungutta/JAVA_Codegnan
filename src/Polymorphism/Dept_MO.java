package Polymorphism;

public class Dept_MO {
    private double sal;
    
    Dept_MO(){
    	sal = 100000;
    	System.out.println("The sal of emp :"+sal);
    }
    void calSal() {
    	float emp1Sal = 200000;
    	System.out.println("This is emp1 salary");
    }
    void calSal(double pf , double df) {
    	  double tSal = pf+ df+ sal;
    	  System.out.println("The total sal :"+tSal);
    }
}
