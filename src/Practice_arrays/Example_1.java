package Practice_arrays;
import java.util.*;
public class Example_1 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of students");
	int n = sc.nextInt();
	int arr[] = new int[n];


	for(int i =0;i<arr.length;i++) {
		System.out.println("Enter the "+i+" student marks");
		arr[i]= sc.nextInt();
	}
	int total = 0, avg = 0;
	int high = arr[0];int low = arr[0];
	
	for(int i=0;i<arr.length;i++) {
		total += arr[i];
		avg = total/n;
	    
		if(arr[i]>high) {
			high = arr[i];
		}
		if(arr[i]<low) {
			low = arr[i];
		}
	}
	System.out.println("Total marks :"+total);
	System.out.println("avg: "+avg);
	System.out.println("High marks:"+high);
	System.out.println("Low marks :"+low);
}
}
