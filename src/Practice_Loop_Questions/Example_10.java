package Practice_Loop_Questions;
//Hospital Patients
import java.util.*;
public class Example_10 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of patients: ");
	int patient = sc.nextInt();
	int count = 0;
	for(int i=1;i<=patient;i++) {
		System.out.println("Enter the temperature for "+i+" patient :");
		double temp = sc.nextDouble();
		if(temp>100) {
			count++;
		}
	}
	System.out.println("No of patients having temparture higher than 100F :"+count);
}
}
