package Control_Statements;
 // Program to reverse a number
import java.util.Scanner;
public class Example_5 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int rev = 0, temp;
	for(;n!=0;) {
		temp = n%10;
		rev = rev*10+temp;
		n = n/10;
	}
	System.out.println("Reverse value :"+rev);
	sc.close();
}
}
