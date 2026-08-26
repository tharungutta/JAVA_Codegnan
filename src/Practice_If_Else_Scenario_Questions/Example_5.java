package Practice_If_Else_Scenario_Questions;
// Speed Limit checker
import java.util.Scanner;
public class Example_5 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter vechile speed : ");
	int speed = sc.nextInt();
	if(speed>80) {
		System.out.println("Overspeeding Fine");
	}else {
		System.out.println("Drive Safely");
	}
	sc.close();
}
}
