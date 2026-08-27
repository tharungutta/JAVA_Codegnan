package Practice_If_Else_Scenario_Questions;
//Courier Charges
import java.util.Scanner;
public class Example_L3_3 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the parcel weight in KG : ");
	int weight = sc.nextInt();
	double cocharge = 0.0;
	if(weight<=1) {
		cocharge = 5.5;
	}else if (weight>1 && weight <=5) {
		cocharge = 7.5;
	}else if(weight >5 && weight <=10) {
		cocharge = 10;
	}else if(weight>10) {
	    cocharge = 20;
	}else {
		System.out.println("Enter the correct weight");
	}
	System.out.println("Courier charge :"+cocharge);
	sc.close();
}
}
