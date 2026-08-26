package Control_Statements;

public class Example_4 {
   public static void main(String[] args) {
	int choice = 2;
	String str = switch(choice)                                  // Switch expression
			{
	case 1->
	     " Case One";
	case 2->
	     "Case Two";
	case 3->
	     "Case Three";
	default->
	      "Default case";
			};
    System.out.println(str);
}
}
