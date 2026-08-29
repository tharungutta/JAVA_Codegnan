package Practice_Loop_Questions;
// Company salary processing
import java.util.Scanner;
public class Example_4 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of employess :");
	int emp = sc.nextInt();
	System.out.println("Enter the salary for 1st employee :");
	double sal = sc.nextDouble();
	double max = sal, min = sal;
	for(int i=2;i<=emp;i++) {
		System.out.println("Enter the salary for  "+i+ " employee :");
		 sal = sc.nextDouble();
		if(sal>max) {
			max = sal;
		}
		if(sal<min)
			   min = sal;
	}
	System.out.println("max salary :"+max);
	System.out.println("Min salary :"+min);
}
}
