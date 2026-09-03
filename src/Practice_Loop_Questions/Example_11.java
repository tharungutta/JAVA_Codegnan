package Practice_Loop_Questions;
//ATM Cash Availability
import java.util.*;
public class Example_11 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double atmCash = 200000;
	int count =0;
	System.out.println("Enter the number of customers to serve : ");
	int n = sc.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.println("Enter the amount for withdraw : ");
		double withDraw = sc.nextDouble();
		if(withDraw>atmCash) {
			System.out.println("Enter the amount below or Equal to :"+atmCash);
			withDraw = 0;
		}
		
		atmCash -= withDraw;
		if(atmCash<500) {
			System.out.println("No cash in the atm , come again tommorow");
			break;
		}
		
		count++;
		if(atmCash<=0) {
			System.out.println("No cash in atm");
			break;
		}		
	}
	System.out.println("Totalm customers served :"+count);
	System.out.println("Remaining cash :"+atmCash);
}
}
