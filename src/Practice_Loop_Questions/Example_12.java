package Practice_Loop_Questions;
//Food delivery Ratings
import java.util.*;
public class Example_12 {
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int custmoers = 10, totalRatings = 0, count=0, count1=0, avg=0;
	 for(int i=1;i<=10;i++) {
		 System.out.println(+i+" customer enter your rating (1-5): ");
		 int rating = sc.nextInt();
		 totalRatings += rating;
		  avg = totalRatings/custmoers;
		 if(rating==5) {
			 count++;
		 }else if(rating<3) {
			 count1++;
		 }		 
		 else if(rating>5){
			 System.out.println("Enter the rating from 0 - 5 ");
			 rating = 0;
			 --i;
		 }
	 }

	 System.out.println("Average Rating : "+avg);
	 System.out.println("Number of 5-Star rating :"+count);
	 System.out.println("Number of ratings below 3 :"+count1);
	 
}
}
