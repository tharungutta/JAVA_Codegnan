package Practice_self;
// move ZERO's to right
import java.util.*;
public class Example_12 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size :");
	int n = sc.nextInt();
	int [] arr = new int[n];
	System.out.println("Enter the array elements: ");
	for(int i= 0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	int index = 0;
	//move non -zero elements forward
	for(int i =0; i<arr.length;i++) {
		if(arr[i]!= 0) {
			arr[index++] = arr[i];
		}
	}
	// Fill remain with zeros
	while(index<arr.length) {
		arr[index++]= 0;
	}
	System.out.println("Array after moving zeros to right");
//	System.out.println(Arrays.toString(arr));
	for(int i= 0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
}
}
