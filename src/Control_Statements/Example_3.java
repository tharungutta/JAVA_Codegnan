package Control_Statements;
import java.util.Scanner;
public class Example_3 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of character ch1: ");
	char ch1 = sc.next().charAt(0);
	switch(ch1) {
	case 'a':
	case 'A':
	case 'e':
	case 'E':
	case 'i':
	case 'I':
	case 'o':
	case 'O':
	case 'u':
	case 'U':{
		System.out.println("These are vowels");
		break;}
	default:{
		System.out.println("Are not vowels");
		break;}
	}
}
}
