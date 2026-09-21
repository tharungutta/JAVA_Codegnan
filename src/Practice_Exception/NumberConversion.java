package Practice_Exception;
import java.util.*;
public class NumberConversion {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double res = 0;
	try {
		System.out.println("Enter the number");
		int num = Integer.parseInt(sc.next().trim());
		res = num*num;
		System.out.println(res);
		
	}catch(NumberFormatException e) {
		System.out.println("Invalid number format");
	}
}
}
