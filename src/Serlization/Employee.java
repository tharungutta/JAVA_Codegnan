package Serlization;

import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {
   private int eno;
   private String ename;
   private String edept;
   public Employee(int eno, String ename, String edept) {
	super();
	this.eno = eno;
	this.ename = ename;
	this.edept = edept;
}
   
   static Employee getValues() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the value of eno");
	   int eno = sc.nextInt();
	   System.out.println("Enter the value of ename");
	   String ename = sc.next();
	   System.out.println("Enter the value of edept");
	   String edept = sc.next();
	   Employee e1 = new Employee(eno,ename,edept);
	   return e1;
	   
   }
   
   void display() {
	   System.out.println(eno);
	   System.out.println(ename);
	   System.out.println(edept);
   }

}
