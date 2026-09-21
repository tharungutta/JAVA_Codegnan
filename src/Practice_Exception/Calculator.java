package Practice_Exception;
import java.util.*;
public class Calculator {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double res = 0.0;
    try {
    	System.out.println("Enter the number 1");
    	int num1 = sc.nextInt();
    	System.out.println("Enter the operator");
    	String op = sc.next();
    	System.out.println("Enter the number 2");
    	int num2 = sc.nextInt();
         switch(op) {
         case "+":
        	 res = num1+num2;
        	 break;
         case "-":
        	 res = num1-num2;
        	 break;
         case "*":
        	 res = num1*num2;
        	 break;
         case "/":
        	 res = num1/num2;
         default:
        	 System.out.println("Inavlid operator");
        	 return;
        
         }
         System.out.println(res);
    }catch(InputMismatchException e) {
    	System.out.println("Enter the correct values");
    }catch(ArithmeticException e) {
    	System.out.println("Cannot divide by zero");
    }
}
}
