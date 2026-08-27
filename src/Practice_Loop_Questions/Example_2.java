package Practice_Loop_Questions;
//Shopping mall Billing
import java.util.Scanner;
public class Example_2 {
  public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter the number of products :");
	int products = sc.nextInt();
	double bill = 0.0;
	for(int i=1;i<=products;i++) {
		System.out.println("Enter the price for "+i+" product");
		double price = sc.nextDouble();
		bill += price;
	}
	System.out.println("Total Products: "+products);
	System.out.println("Total Bill :"+bill);
	sc.close();
}
}
