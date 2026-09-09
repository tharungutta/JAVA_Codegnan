package Encapsulation;

public class Employee {
	
	private int empNo;
	 private double empSal;
   public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
    public void display() {
    	System.out.println(empNo);
    	System.out.println(empSal);
    }
   
   
}
