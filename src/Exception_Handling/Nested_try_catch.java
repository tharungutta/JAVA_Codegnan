package Exception_Handling;
import java.util.*;
public class Nested_try_catch {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int c = a/b;
			System.out.println("The value of c is :"+c);
			try {
				int []arr = {1,2,3,4,5};
				arr[10] = 100;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);                               
				e.printStackTrace();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}
