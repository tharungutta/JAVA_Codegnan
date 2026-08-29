package Practice_Loop_Questions;
//Cricket match
import java.util.*;
public class Example_6 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int matches = 10;
	double totalruns = 0, avgruns= 0, highscore = 0;
	for(int i=1;i<=matches;i++) {
		System.out.println("Enter the score for"+i+" match :");
		double score = sc.nextDouble();
		totalruns += score;
		avgruns = totalruns/matches;
		if(score>highscore) {
			highscore = score;
		}
	}
	System.out.println("Total runs :"+totalruns);
	System.out.println("Average runs :"+avgruns);
	System.out.println("Highest score:"+highscore);
}
}
