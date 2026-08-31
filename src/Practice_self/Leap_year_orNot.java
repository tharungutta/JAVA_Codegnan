package Practice_self;
//Leap Year or Not
import java.util.*;
public class Leap_year_orNot {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the year to check :");
	int year = sc.nextInt();
	if(year %400 ==0  || (year %4 ==0 && year%100 != 0)) {
		System.out.println("Leap Year");
	}else{
	    System.out.println("Not Leap Year");
	}
}
}
