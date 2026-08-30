package Practice_Loop_Questions;
//Restaurant Feedback
import java.util.*;
public class Example_9 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int customers = 10; int count =0; double avgRating = 0;
    int sumRatings = 0;
	for(int i=1;i<=10;i++) {
		System.out.println(i+"th customer enter your rating(1-5) : ");
		int rating = sc.nextInt();
        sumRatings += rating;
		if(rating==5) {
			count++;
		}		
	}
	avgRating = sumRatings/customers;
	System.out.println("Average Rating :"+avgRating);
	System.out.println("No of 5 Star Rating :"+count);
}
}
