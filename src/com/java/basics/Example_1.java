package com.java.basics;
 import java.util.Scanner;
public class Example_1 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the integer ");
	int num  = sc.nextInt(); 
	System.out.println("Enter your name: ");
	String name = sc.nextLine();
	System.out.println(num);
	System.out.println(name);
	sc.close();
}
}
