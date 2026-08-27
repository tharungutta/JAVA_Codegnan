package Practice_If_Else_Scenario_Questions;
//Customer support 
import java.util.Scanner;
public class Example_L4_3 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the menu(1-4) for customer support : ");
	int num = sc.nextInt();
	switch(num) {
	case 1:
		System.out.println("Billing");
		break;
	case 2:
		System.out.println("Technical support");
		break;
	case 3:
		System.out.println("Complaint");
		break;
	case 4:
		System.out.println("Feedback");
		break;
	default:
		System.out.println("Enter the correct number for customer support");
	}
	sc.close();
	
}
}
