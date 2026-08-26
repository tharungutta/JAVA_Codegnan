package Practice_If_Else_Scenario_Questions;
// ATM Services                                             ----- Switch case scenario based questions
import java.util.Scanner;
public class Example_L4_1 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Select the menu (1-4) : ");
	int menu = sc.nextInt();
	switch(menu) {
	case 1:
		System.out.println("Balance Enquiry");
		break;
	case 2:
		System.out.println("Cash Withdrawal");
		break;
	case 3:
		System.out.println("Deposit");
		break;
	case 3+1:
		System.out.println("Mini Statement");
	    break;
	 default:
		 System.out.println("Enter the number correctly in menu ");
	}
	sc.close();
}
}
