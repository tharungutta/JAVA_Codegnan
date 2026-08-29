package Practice_Loop_Questions;
//Mobile reacharge shop
import java.util.*;
public class Example_8 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int amount = 0;
	double total = 0.0;
	System.out.println("Enter the recharge amount (0 to stop) : ");
	amount = sc.nextInt();
	while(amount !=0) {
		total += amount;
		amount = sc.nextInt();
	}
	System.out.println("Total revenue :"+total);
}
}
