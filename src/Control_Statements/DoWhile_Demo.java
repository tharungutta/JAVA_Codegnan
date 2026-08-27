package Control_Statements;
import java.util.Scanner;
public class DoWhile_Demo {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of n :");
	int n = sc.nextInt();
	int i =0;
	do {
		System.out.println("the value of i is : "+i);
//		i++;
	}while(i>=n);
	sc.close();
}
} 
