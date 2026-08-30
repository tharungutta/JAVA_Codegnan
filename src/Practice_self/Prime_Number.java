package Practice_self;
// to check given number is prime or not
import java.util.Scanner;
public class Prime_Number {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check is prime :");
	int num = sc.nextInt();
	if(num<=1) {
		System.out.println(num+ " It is not a prime number");
		}else {
			boolean isPrime = true;
			for( int i=2; i*i <= num;i++) {
				if(num%i==0) {
					isPrime  = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(num+" is a prime number");
			}else {
				System.out.println("It is not a prime number");
			}
		}
	sc.close();
}
}
