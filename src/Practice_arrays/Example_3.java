package Practice_arrays;
import java.util.*;
public class Example_3 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of products : ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the prices of products :");
		arr[i]= sc.nextInt();
	}
	int total = 0, count = 0;
	int expensive = arr[0] , index = 0;
	for(int i=0;i<arr.length;i++) {
		total += arr[i];
		if(arr[i]>1000) {
			count++;
		}
		if(arr[i]>expensive) {
			expensive = arr[i];
			 index = i+1;
		}
	}
	System.out.println("Toatl bill :"+total);
	System.out.println("no of products more than 1000 :"+count);
	System.out.println("Moxt expemsive product cost :"+expensive+" product no :"+index);
	
}
}
