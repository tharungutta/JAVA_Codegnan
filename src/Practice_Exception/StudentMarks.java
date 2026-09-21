package Practice_Exception;
import java.util.*;
public class StudentMarks {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [] marks = {85, 76, 90, 65, 88};
	try {
		System.out.println("Enter the student number: ");
		int num = marks[sc.nextInt()-1];
		System.out.println(num);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array out of bounds");
	}catch(InputMismatchException e) {
		System.out.println("Invalid input");
	}
} 
}
