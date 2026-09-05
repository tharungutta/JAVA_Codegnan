package Practice_arrays;
//Employee id search
import java.util.*;
public class Example_6 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of emp :");
	int n = sc.nextInt();
	int arr[]= new int[n];
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the employee id :");
		arr[i]= sc.nextInt();
	}
	System.out.println("Enter the emp id for searching : ");
	int search = sc.nextInt();
	int count = 0; 
	int index = Search(arr, search);
	if(index == -1) {
		System.out.println("Element not found");
	}else {
		System.out.println("Element found at index position :"+index);
	}

   }
   public static int Search(int arr[], int search) {
	   for(int i=0;i<arr.length;i++) {
			if(arr[i]== search) {
				return i;
			}
		}
	   return -1;
   }
}
