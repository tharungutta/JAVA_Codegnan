package Arrays;
import java.util.*;
public class Jagged_Array {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	int [][]arr = new int[3][];
	arr[0]=new int[3];
	arr[1]= new int[2];
	arr[2]= new int[4];
	                               // with inizilation
//	arr[0][0]= 10;
//	arr[0][1]= 20;
//	arr[0][2]=30;
//	
//	arr[1][0]= 40;
//	arr[1][1]= 50;
//	
//	arr[2][0]= 60;
//	arr[2][1]= 70;
//	arr[2][2]= 80;
//	arr[2][3]= 90;
	
//	System.out.println("The given values are :");
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[i].length;j++) {
//			System.out.print(arr[i][j]+" ");
//		}
//		System.out.println();
//	}
	
	                                // from the user input
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print("Enter the values of an array a["+i+"]["+j+"] : ");
			arr[i][j]= sc.nextInt();
		}
	}
	                                                           // to print values code same for inilizing and getting the input from user
	System.out.println("The given values are :");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	
}
}
