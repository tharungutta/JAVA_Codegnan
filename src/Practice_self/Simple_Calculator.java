package Practice_self;
//Calculator
import java.util.*;
public class Simple_Calculator {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number :");
	double num1 = sc.nextDouble();
	System.out.println("Enter the opeartion (+, -, *, /) : ");
	char operator = sc.next().charAt(0);
	System.out.println("Enter the second number : ");
	double num2 = sc.nextDouble();
	switch(operator) {
	case '+':
		System.out.println("Result :"+ (num1+num2));
		break;
	case '-':
		System.out.println("Result: "+ (num1-num2));
		break;
	case '*':
		System.out.println("Result : "+(num1 * num2));
		break;
	case '/':
		if(num2 != 0) {
			System.out.println("Result :"+(num1/num2));
		}else {
			System.out.println("Cannot divide by Zero");
		}
		break;
	default:
		System.out.println("Inavlid operator");
		break;
	}
}
}
