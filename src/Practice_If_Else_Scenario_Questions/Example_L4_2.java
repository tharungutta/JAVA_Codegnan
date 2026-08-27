package Practice_If_Else_Scenario_Questions;
//Traffic signal
import java.util.Scanner;
public class Example_L4_2 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the traffic signal color : ");
	char colour = sc.next().charAt(0);
	switch(colour) {
	case 'R','r' :
//	case 'r':
		System.out.println("Stop");
		break;
	case 'y','Y':
		System.out.println("Ready");
		break;
	case 'G','g':
		System.out.println("Go");
		break;
	default:
		System.out.println("Enter the correct color");
	}
	sc.close();
}
}
