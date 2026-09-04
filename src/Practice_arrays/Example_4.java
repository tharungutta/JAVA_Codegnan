package Practice_arrays;
// Attendence tracker
import java.util.*;
public class Example_4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
		    System.out.println("Enter the attendence for students in (0-absent | 1- present) :");
		    arr[i]= sc.nextInt();
			if(arr[i]>1) {
				System.out.println("Enter the number in 0 or 1 :");
				--i;
			}	
		}
		double present = 0, absent = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				absent++;
			}else if(arr[i]==1) {
				present++;
			}
		}
		double presentPerc = present/n;
		double absentPerc = absent/n;
		System.out.println("Total present :"+present);
		System.out.println("Total absent :"+absent);
		System.out.println("Present % :"+presentPerc);
		System.out.println("Absent % :"+absentPerc);
		sc.close();
	}
}
