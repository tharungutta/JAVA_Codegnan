package Exception_Handling;
import java.util.*;
public class ExceptionDemo {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	try {
		int c = a/b;
		System.out.println("The value of c is :"+c);
	}
	catch(Exception e) {
	//	System.out.println(e);                    // java.lang.ArithmeticException: / by zero   , it will print the exception name and reason for that by printing e.
//		e.printStackTrace();                       // complete information :java.lang.ArithmeticException: / by zero
	                                                                         //at SampleProject/Exception_Handling.ExceptionDemo.main(ExceptionDemo.java:10)
		System.out.println("Invalid numbers");
	}
	System.out.println("After exception rises");
}
}
