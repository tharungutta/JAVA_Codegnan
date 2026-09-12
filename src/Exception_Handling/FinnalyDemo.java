package Exception_Handling;
import java.io.FileReader;
import java.util.*;
public class FinnalyDemo {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [] arr = {1,2,3,4,5};
	try//(FileReader fr = new FileReader("abc.txt");)      // to close the file reader file manually we are using finally block
	{          
		arr[10] = 100;
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Statements from finnaly block");
	}
}
}
