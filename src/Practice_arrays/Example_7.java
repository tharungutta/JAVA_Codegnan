package Practice_arrays;
//Product stock search
import java.util.*;
public class Example_7 {
	public static void search(int arr[], int target) {
		int count = 0;
		System.out.println("Product out of stock at indexes : ");
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==target) {
				 System.out.print(i +" ");
				 count++;
			}
		}
		System.out.println();
		System.out.println("no of products out of stock are :"+count);
		
	}
	
  public static void main(String[] args) {
	int arr[]= {10,25,0, 15, 30,0,20};
	int target = 0;
	 search(arr, target);

	}
}
