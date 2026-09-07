package Abstraction;

public final class FinalDemo {
   protected final int a, b;
   FinalDemo(){
	   a = 100;
	   b = 200;
	   System.out.println("This is FinalDemo super class constructor");
   }
   void display() {
	   System.out.println("The value of a :"+a);
	   System.out.println("The value of b:"+b);
   }
   final void addition() {
	   System.out.println("this is addition final method");
   }
}
