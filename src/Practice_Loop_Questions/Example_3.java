package Practice_Loop_Questions;
//Student attendance
import java.util.Scanner;
public class Example_3 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int stu = 30;
	int present= 0, absent =0;
	for(int i=1;i<=stu;i++) {
		System.out.println("Enter the attendence for "+i+" student");
		int data = sc.nextInt();	
		if(data == 0) {
			absent++;
		}else if(data == 1) {
			present++;
		}else {
			System.out.println("Enter the value in 0 and 1");
		}
	}
	System.out.println("total present : "+present);
	System.out.println("Totral absent:"+absent);
	sc.close();
}
}
