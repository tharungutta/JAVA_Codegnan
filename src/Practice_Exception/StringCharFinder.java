package Practice_Exception;
import java.util.*;
public class StringCharFinder {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name = "JavaProgramming";
	try {
		System.out.println("Enter the index number");
		char letter = name.charAt(sc.nextInt());
		System.out.println(letter);
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("Invalid character position.");
	}
}
}
