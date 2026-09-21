package Practice_Exception;
import java.util.*;
public class Result_Calculator {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks");
	int marks = 0;
	for(int i=1;i<=5;i++) {
		try {
			marks += sc.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println("Please enter the numeric values");
			sc.next();
			i--;
		}
	}
	double avg = marks/5.0;
	double perc = (marks/500.0)*100;
	System.out.println("Avg marks:"+avg);
	System.out.println("perc:"+perc);
}
}
