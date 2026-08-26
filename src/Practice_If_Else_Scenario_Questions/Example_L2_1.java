package Practice_If_Else_Scenario_Questions;
// College Admission                                ---- Nested if
import java.util.Scanner;
public class Example_L2_1 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your 12th marks : ");
	int marks = sc.nextInt();
	System.out.println("Enter your Entrance exam rank : ");
	int rank = sc.nextInt();
	if(marks>=60) {
		if(rank <= 1000) {
			System.out.println("Admission is granted");
		}else {
			System.out.println("Admission is rejected..");
		}
	}else {
		System.out.println("Admission is rejected");
	}
	sc.close();
}
}
