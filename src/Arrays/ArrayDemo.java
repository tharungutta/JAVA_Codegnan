package Arrays;

public class ArrayDemo {
   public static void main(String[] args) {
	int [] arr = {1,23,45,56,67};
	System.out.println("The given values of array is : ");
	for(int i=0;i<arr.length;i++) {
		System.out.println("arr["+i+"] :  " +arr[i]);
	}
	System.out.println("Using for each loop");
	for(int j :arr) {
		System.out.println(j);
	}
}
}
