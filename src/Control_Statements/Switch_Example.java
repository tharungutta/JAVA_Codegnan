package Control_Statements;
import java.util.Scanner;
public class Switch_Example {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	   switch(num){
	   case 10:
	   {
		   System.out.println("This is case 10");
		   break;                           // if we won't use break statement , then the case matching and the case below that also get executed , with default block.
	   }
	   case 5:                  
	   {
		   System.out.println("This is case 5");
		   break;
	   }
	   case 15:
	   {
		   System.out.println("This is case 15");
		   break;
	   }
	   default:
	   {
		   System.out.println("Not matching to the case");
		   break;
	   }
	   }
	   sc.close();
}
}
