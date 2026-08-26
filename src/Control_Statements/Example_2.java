package Control_Statements;
import java.util.Scanner;
public class Example_2 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Eno :");
	int eno  = sc.nextInt();
	System.out.println("Enter the salary: ");
	float esal = sc.nextFloat();
	double da = 0.0, ta = 0.0, pf = 0.0;
	if(esal > 70000) {
		 da = 0.1* esal;
		 ta = 0.12*esal;
		 pf = 0.05*esal;
	}else if((esal>50000)&&(esal<70000)) {
		 da = 0.12* esal;
		 ta = 0.1*esal;
		 pf = 0.06*esal;
	}else if((esal>30000)&&(esal<50000)) {
		 da = 0.08* esal;
		 ta = 0.07*esal;
		 pf = 0.04*esal;	
	}else if(esal<30000) {
	     da = 0.06* esal;
		 ta = 0.04*esal;
		 pf = 0.03*esal;
	}else {
		System.out.println("The given credentials are wrong");
	}
	double gross = da + ta +esal;
	double net = gross - pf;
	System.out.println("Gross salary :"+gross);
	System.out.println("Net Salary :"+net); 
}
}
