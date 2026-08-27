package Practice_If_Else_Scenario_Questions;
//Parking fee
import java.util.Scanner;
public class Example_L3_4 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the hours :");
	int hours = sc.nextInt();
	double pfee = 0.0;
	if(hours <=2) {
		pfee = hours * 30;
	}else if(hours>=3 && hours<=5) {
		pfee = (2*30)+((hours-2)*20);
	}else{
		pfee =(2*30)+(3*20)+((hours-5)*10);
	}
	System.out.println("Parking Fee : "+pfee);
	sc.close();
}
}
