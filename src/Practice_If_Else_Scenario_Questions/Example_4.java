package Practice_If_Else_Scenario_Questions;
// Mobile Recharge Offer
import java.util.Scanner;
public class Example_4 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter recharge amount : ");
	   int recharge = sc.nextInt();
	   String data = "1 GB daily";
	   if(recharge>299) {
		   data = "1GB daily"+" + 2 GB";
		   System.out.println("Data :"+data);
	   }else {
		   System.out.println("No extra data for your plan");
	   }
	   sc.close();
}
}
