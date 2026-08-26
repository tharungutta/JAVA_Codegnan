package Control_Statements;
import java.util.Scanner;
public class Switch_String {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the months");
	String str = sc.next();
	switch(str) {
	case "January":
		System.out.println("This is January");
		break;
	case "March":
		System.out.println("This is march");
		break;
	default:
		System.out.println("Input mismatch");
		break;
	}
}
} 
