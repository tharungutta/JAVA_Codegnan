package Arrays;
// WAJA to search a given value in a array of elements then print position,,for second print the how many times it is repeated
import java.util.*;
public class Example_4 {
	public static int search(int[]arr, int key) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%key==0)
			{
				System.out.println("number is present at "+i+" position");
				return i;		
			}
		}
		return -1;
	}

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int []arr = {1,2,3,5,6,3,7,4,8,3};
	System.out.println("Enter the element to search: ");
	int key = sc.nextInt();
	int num = search(arr, key);

	if(num == -1) {
		System.out.println("Data is not present");
	}else {
		System.out.println("Data is present");
	}

}
  
}

