package Control_Statements;
// Program to find biggest number using if else 
public class Example_1 {
   public static void main(String[] args) {
	   int a =10, b = 20;
	   if (a>b) {
		   System.out.println("a is grater than b");
	   }else {                                                                  // nested if else example
		   if(b>a) {
			   System.out.println("b is grater than a");
		   }
		   System.out.println("both are equal");
	   }
}
}
