package Practice_If_Else_Scenario_Questions;
//Employees Salary Hike
import java.util.Scanner;
public class Example_L3_2 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the employee rating in numbers (1-5) : ");
	int rating = sc.nextInt();
	System.out.println("Enter your Salary: ");
	double salary = sc.nextDouble();
	double hike =0.0, hikedsal=0.0;
	if(rating == 5) {
		hike = salary*0.2;
		hikedsal = salary+hike;
	}else if(rating ==4) {
		hike = salary*0.15;
		hikedsal = salary+hike;
	}else if(rating ==3) {
		hike = salary*0.1;
		hikedsal = salary+hike;
	}else if(rating <3) {
		hike = 0.0;
		System.out.println("No hike for you");
	}else{
		System.out.println("Enter correctly");
	}
	System.out.println("Rating :"+rating);
	System.out.println("Salary :"+salary);
	System.out.println("Hiked Salary :"+hikedsal);
}
}
