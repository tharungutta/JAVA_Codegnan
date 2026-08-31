package Practice_self;
//Largest of 3 numbers
import java.util.Scanner;
public class Largest_of_3_numbers {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values :");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int largest = a;
	if(b>largest) {
		largest = b;
	}
	if(c>largest) {
		largest = c;
	}
	System.out.println("Largest :"+largest);
}
}
