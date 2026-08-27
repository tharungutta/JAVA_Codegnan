package Practice_If_Else_Scenario_Questions;
//Language selection
import java.util.Scanner;
public class Example_L4_4 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the nyumber(1-3) to select language: ");
	int n = sc.nextInt();
	switch(n) {
	case 1:
		System.out.println("Telugu");
	    break;
	case 2:
		System.out.println("English");
		break;
	case 3:
		System.out.println("Hindi");
		break;
	default:
		System.out.println("Enter the correct number");
	}
	sc.close();
}
}
