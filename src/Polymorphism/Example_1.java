package Polymorphism;

public class Example_1 {                                    // Method Overloading
   public void m1(int a , int b) {
	   System.out.println("A:"+a+" B:"+b);
   }
   public void m1(int b , String a) {
	   System.out.println("b:"+b+" String:"+a);
   }
   public void m1(int a, int b, int c) {
       System.out.println("A:"+a+" B:"+b+" C:"+c);	   
   }
   public static void main(String[] args) {
	Example_1 e1 = new Example_1();
	e1.m1(10,20);
	e1.m1(10,20,30);
	e1.m1(50,"Tharun");
	
}
}
