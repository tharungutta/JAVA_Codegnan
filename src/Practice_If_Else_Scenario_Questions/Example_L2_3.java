package Practice_If_Else_Scenario_Questions;
// Credit card approval
import java.util.Scanner;
public class Example_L2_3 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your salary : ");
	double salary = sc.nextDouble();
	System.out.println("Enter your credit score : ");
	int credit = sc.nextInt();
	System.out.println("Enter your age : ");
	int age = sc.nextInt();
	if(salary>=40000) {
		if(credit >=750) {
			if(age >= 21) {
				System.out.println("Credit card is approved");
			}else{
				System.out.println("Credit card not approved");
			}
		}else {
			System.out.println("Credit card not approved");
		}
	}else {
		System.out.println("Credit card not approved");
	}
}
}
