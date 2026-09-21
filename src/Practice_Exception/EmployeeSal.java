package Practice_Exception;
import java.util.*;
public class EmployeeSal {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	  double [] salaries = {25000, 30000, 45000, 55000, 70000};
	  double annual = 0; double bonus =0.0;
	  try {
		  System.out.println("Enter the emp no:");
		  double num = salaries[sc.nextInt()-1];
		  annual = num*12;
		  bonus = annual+10000;
		  System.out.println(num);
		  System.out.println(annual);
		  System.out.println(bonus);
	  }catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("Array ou of bounds");
	  }catch(InputMismatchException e) {
		  System.out.println("Inavlid numbers");
	}
	}
}


