package Arrays;
// uniform rows and columns
import java.util.*;
public class Example_5 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [][]arr = new int[3][3];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print("Enter the values of an array a["+i+"]["+j+"] : ");
			arr[i][j]= sc.nextInt();
		}
	}
	System.out.println("The given values are :");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	sc.close();
}
}
