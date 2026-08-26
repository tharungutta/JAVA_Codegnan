package Practice_If_Else_Scenario_Questions;
// Loan Eligibility
import java.util.Scanner;
public class Example_1 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age : ");
	int age = sc.nextInt();
	System.out.println("Enter your salary : ");
	double salary = sc.nextDouble();
	if(age>=21 && salary>=25000) {
		System.out.println("Eligible for loan");
	}else {
		System.out.println("Not eligible for loan");
	}
	sc.close();
}
}
