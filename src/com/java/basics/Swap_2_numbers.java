package com.java.basics;

public class Swap_2_numbers {                         // Swapping of 2 numbers without 3 variables and arthimetic operators
   public static void main(String[] args) {
	int a=10 , b =20;
	 a = a ^ b;
	 b = a ^ b;
	 a = a ^ b;
	 System.out.println(a);
	 System.out.println(b);

	
}
}