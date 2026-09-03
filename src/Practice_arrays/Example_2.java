package Practice_arrays;
import java.util.*;
public class Example_2 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of employees :");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the salaries :");
		arr[i] = sc.nextInt();
	}
	int high = arr[0], low = arr[0], count = 0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>high) {
			high = arr[i];
		}
		if(arr[i]<low) {
			low = arr[i];
		}
		if(arr[i]>50000) {
			count++;
		}
	}
	System.out.println("Highest salary:"+high);
	System.out.println("Lowest Salary :"+low);
	System.out.println("No of emp earning morethan 50000:"+count);
}
}
