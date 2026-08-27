package Practice_Loop_Questions;
//ATM transaction summary
import java.util.Scanner;
public class Example_1 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double sum = 0.0;
	 for( int i=1;i<=7;i++) {
		 System.out.println("Enter the amount to withdraw "+i +" day : ");
		 int amount = sc.nextInt();
		 sum +=amount;
	}
	 System.out.println("Total amount in 7 days :"+sum);
	 sc.close();
}
}
