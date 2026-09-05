package Practice_self;
import java.util.*;
public class Menu {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the menu options :" );
	int menu = sc.nextInt();
	switch(menu) {
	case 1 ->{
		System.out.println("insert employee");
		System.out.println("Enter the employee id:");
		int id = sc.nextInt();	
		System.out.println("Enter the employee name :");
		String name = sc.nextLine();
		System.out.println();
		System.out.println("Enter the employee salary :");
		double sal = sc.nextDouble();
	//	System.out.println("Enter the employee :");
	}
	case 2 ->
		System.out.println("update employee");
	case 3 ->
	    System.out.println("delete employee");
	case 4 ->
	    System.out.println("select employee");
	}
}
}
