package Practice_self;
//coping from one array to another array
import java.util.Arrays;
public class Array1_Coping_Array2 {
  public static void main(String[] args) {
	int [] a = {10,20,30,40};
	System.out.println("Original array");
	System.out.println(Arrays.toString(a));
	int [] copy = new int[a.length];
	for(int i=0; i<a.length;i++) {
		copy[i] = a[i];
	}
	System.out.println("Copied array");
	for(int i=0; i<copy.length;i++) {
		System.out.print(copy[i]+" ");
	}
	
}
}
