package Exception_Handling;
import java.util.*;
public class BankingApp {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	int amount = sc.nextInt();
	int customers = sc.nextInt();
	try {
		int perC = amount/customers;
		System.out.println("per customer:"+perC);
	}catch(Exception e) {
		System.out.println(e);
		System.out.println("Invalid ");
	}
	System.out.println("Amount:"+amount);
	System.out.println("Customers:"+customers);
}
}
