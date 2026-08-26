package Practice_If_Else_Scenario_Questions;
//Movie Ticket Eligibility
import java.util.Scanner;
public class Example_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		if(age>18) {
			System.out.println("You can watch movie");
		}else {
			System.out.println("Age is restricted to watch movie");
		}
		sc.close();
	}

}
