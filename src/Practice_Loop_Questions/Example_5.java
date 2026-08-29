package Practice_Loop_Questions;
//Online quiz application
import java.util.*;
public class Example_5 {  
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int correct=0, wrong=0;
	for(int i=1;i<=10;i++) {
		System.out.println("Enter the answer correct or wrong in (1 or 0) for  "+i+" question" );
		int n = sc.nextInt();
		if(n == 1 ) {
			correct++;
		}else if(n ==0) {
			wrong++;
		}else {
			System.out.println("enter the values in 0 and 1");
		}
	}
	int finalsc = correct;
	System.out.println("Total correct answers: "+correct);
	System.out.println("Total wrong answers : "+wrong);
	System.out.println("Final score: "+finalsc);
}
}
