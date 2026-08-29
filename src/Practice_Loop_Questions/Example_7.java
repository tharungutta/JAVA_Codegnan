package Practice_Loop_Questions;
//Electricity bill
import java.util.*;
public class Example_7 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int month = 12;
	double tunits = 0.0, average=0.0;
	for(int i=1;i<month;i++) {
		System.out.println("Enter the electricity bill for "+i+" month :");
		double bill = sc.nextDouble();
		tunits += bill;
		average = tunits/month;
	}
	System.out.println("Total units: "+tunits);
	System.out.println("Average monthly consumption:"+average);
}
}
