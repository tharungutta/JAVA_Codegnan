package Control_Statements;
import java.util.Scanner;
public class for_Demo {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n  = sc.nextInt();
//	for(int i=0; i<n;i++) {
//		System.out.println("The value of i is" +i);
//	}
	int i =0 , sum = 0;
	for( ;i<=n; ) {
		sum = sum+i;
		i++;
	}
	System.out.println("sum of numbers :" +sum);
}
}
