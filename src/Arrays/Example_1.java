package Arrays;
import java.util.Scanner;
public class Example_1 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [] arr = new int[10];
	for(int i=0; i<arr.length;i++) {
		System.out.println("a["+i+"] : ");
		 arr[i] = sc.nextInt();
	}
	System.out.println("The given values are: ");
	for(int j:arr) {
		System.out.println(j);
	}
}
}
