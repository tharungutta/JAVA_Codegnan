package Practice_If_Else_Scenario_Questions;
// income tax calculation                ---- else - if 
import java.util.Scanner;
public class Example_L3_1 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your income");
	double income = sc.nextDouble();
	double tax = 0.0, fincome= 0.0;
	if(income<=250000) {
		System.out.println("No TAX for you");
	}
	else if(income>=250001 && income <=500000) {
		tax = income *0.05;
		fincome = income -tax;
	}else if(income>=500001 && income<=1000000) {
		tax = income*0.2;
		fincome = income -tax;
	}else if(income > 1000000) {
		tax = income*0.3;
		fincome = income - tax;
	}else {
		System.out.println("Enter your income correctly");
	}
	System.out.println("Income :"+income);
	System.out.println("Tax reduced income :"+fincome);
	sc.close();
}
}
