package Control_Statements;
// to check weather the number is prime number or not
import java.util.Scanner;
public class Continue_EX_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the starting number :");
	int num = sc.nextInt();
		int count = 0;
		for(int i=1; i<= num;i++) {
			if(num%i != 0) {
				continue;			
			}
			count++;
		}
		if(count == 2) {
			System.out.println("Prime number :"+num);
		}else {
			System.out.println("Not a prime");
		}
}
}
