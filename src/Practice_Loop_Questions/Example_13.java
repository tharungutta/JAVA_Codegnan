package Practice_Loop_Questions;
//Company Recruitment
import java.util.*;
public class Example_13 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of candiatetes : ");
	int n = sc.nextInt();
	int apt = 0, tech= 0, select=0, reject=0;
	for(int i=1;i<=n;i++) {
		System.out.println("Enter the "+i+ " candiatate Aptitude score :");
		 apt = sc.nextInt();
		System.out.println("Enter the "+i+" candiate technical score :");
        tech = sc.nextInt();
        if(apt>=70 && tech>=75) {
    		select++;
    	}else {
    		reject++;
    	}
	}
	
	System.out.println("Total selected :"+select);
	System.out.println("Total Rejected : "+reject);
}
}
