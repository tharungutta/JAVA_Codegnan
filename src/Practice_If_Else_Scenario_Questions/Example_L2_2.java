package Practice_If_Else_Scenario_Questions;
//Online Food delivery
import java.util.Scanner;
public class Example_L2_2 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the order Amount : ");
	int amount = sc.nextInt();
	System.out.println("Confirm your are a premium member (true/false) : ");
	boolean premium = sc.nextBoolean();
	if(amount >= 500) {
		if(premium) {
			System.out.println("free delivery");
		}else {
			System.out.println("delivery charge : +50");
		}
	}else {
		System.out.println("Delivery charge : +50");
	}
	sc.close();
}
}
