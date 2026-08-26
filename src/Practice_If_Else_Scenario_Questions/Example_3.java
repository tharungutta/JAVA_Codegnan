package Practice_If_Else_Scenario_Questions;
// Electricity Bill Discount
import java.util.Scanner;
public class Example_3 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your electricity bill : ");
	int bill = sc.nextInt();
	double discount = 0.0;
	double fbill = 0.0;
	if(bill>5000) {
		discount = bill*0.1;
		fbill = bill-discount;
		System.out.println("Discounted Bill amount :"+fbill);
	}else {
		System.out.println("Bill amount :"+bill);
	}
	sc.close();
}
}
