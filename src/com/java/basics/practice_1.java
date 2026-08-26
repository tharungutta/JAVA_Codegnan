package com.java.basics;

public class practice_1 {
	static int b = 20;     // static variable
	int c = 30;              // instance  variable
	public static void m1() {
	      int a = 10;           // local variable
	      System.out.println(a);
	}
  public static void main(String[] args) {
	m1();
	System.out.println(practice_1.b);
	System.out.println(b);
	
//	System.out.println(c);   // error - instance we can't access in method
}
}
