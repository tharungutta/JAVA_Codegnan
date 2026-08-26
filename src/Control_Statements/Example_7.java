package Control_Statements;
// Write a java program to print numbers from a given range
import java.util.Scanner;
public class Example_7 { 
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the starting range :");
	int start = sc.nextInt();
	System.out.println("Enter the ending range :");
	int end = sc.nextInt();
	for ( ;start<=end;) {
		int count = 0;
		for(int i=1; i<= start;i++) {
			if(start%i==0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Prime number :"+start);
		}
		start++;
	}
}
}
