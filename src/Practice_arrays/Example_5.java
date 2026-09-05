package Practice_arrays;
//Daily Temperature
import java.util.*;
public class Example_5 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of days :");
	int n = sc.nextInt();
	int arr[]= new int[n];
	for(int i=0; i<arr.length;i++) {
		System.out.println("Enter the temperatures : ");
		arr[i]= sc.nextInt();
	}
	int high = arr[0], low = arr[0];
	double avg = 0 , sum = 0;
	int count = 0, highIndex = 0;
	for(int i=0 ;i<arr.length;i++) {
		if(arr[i]>high) {
			high = arr[i];
			highIndex = i+1;
		}
		if(arr[i]<low) {
			low = arr[i];
		}
		sum += arr[i];
		avg = sum/n;
		if(arr[i]>35) {
			count++;
		}
	}
	System.out.println("Highest Temp:"+high);
	System.out.println("Highest temp day: "+highIndex);
	System.out.println("Lowest Temp :"+low);
	System.out.println("Avg temp :"+avg);
	System.out.println("No of days abobe 35 c :"+count);
	sc.close();
}
}
