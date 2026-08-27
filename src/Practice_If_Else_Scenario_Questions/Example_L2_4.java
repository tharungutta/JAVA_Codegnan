package Practice_If_Else_Scenario_Questions;
//Employee Promotion
import java.util.Scanner;
public class Example_L2_4 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the experience in year:");
	int exp = sc.nextInt();
	System.out.println("Enter the rating :");
	double rating = sc.nextDouble();
	if(exp>=5) {
		if(rating>=4.5) {
			System.out.println("Eligible for promotion");
		}else {
			System.out.println("Not eligible for promotion (Rating is too low)");
		}
	}else {
		System.out.println("Not eligible (Experience is too low)");
	}
	sc.close();
}
}
