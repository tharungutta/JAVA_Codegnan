package Control_Statements;
// to check Armstrong number
import java.util.Scanner;
public class whileExample {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check Armstrong number :");
	int n = sc.nextInt();
	int arm = n;
	int temp, sum=0, count=0 ;
	while(n>0) {
		temp = n%10;
		count++;
		n = n/10;
	}
	while(n>0) {
		temp = n%10;
		sum += temp*temp*temp;
		n = n/10;
	}
	if(sum == n) {
		System.out.println("Armstrong number");
	}else {
		System.out.println("Not an Armstrong");
	}
	sc.close();
}
}
