package Practice_If_Else_Scenario_Questions;
//Scholarship eligibility
import java.util.Scanner;
public class Example_L2_5 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks :");
	int marks = sc.nextInt();
	System.out.println("Enter the family Income :");
	double fincome = sc.nextDouble();
	if(marks >= 90) {
		if(fincome < 300000) {
			System.out.println("Eligible for scholarship ");
		}else {
			System.out.println("Not eligible ( family income is more)");
		}
	}else {
		System.out.println("Not eligible (marks are low)");
	}
	sc.close();
}
}
