package Abstraction;

abstract public class Shape {                                                   // abstract class 
   protected int len,bre;
   
   Shape(){
	   len = 10;
	   bre = 20;
	   System.out.println("This is abstract class constructor");
   }
   void display() {                                                             // concrete method
	   System.out.println("The value of len is"+len);
	   System.out.println("The value of bre is"+bre);
   }
   abstract  void area() ;         // abstract method   , it cannot be private , it cannot be static also, if it is static it will give illegal combination error.
   

}
