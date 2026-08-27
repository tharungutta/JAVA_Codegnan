package Control_Statements;
//To check given number is strong number
import java.util.Scanner;
public class Example_11 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check it is strong number :");
	int n = sc.nextInt();
	int sum = 0;
	int strong  = n;
	for( ;n!=0;) {
		int temp = n%10;
		   int fact = 1;
		   for(int i=1;i<=temp;i++) {
			   fact = fact*i;
		   }
		   sum = sum +fact;
		   n = n/10;
	}
	if(strong == sum) {
		System.out.println("It is a strong number");
	}else {
		System.out.println("It is not a strong number");
	}
	sc.close();
}
}
