package com.java.basics;
import java.util.Scanner;
public class Decrement_Example {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a :");
	int a = sc.nextInt();
	System.out.println("Enter the valiue of b :");
	int b = sc.nextInt();
	int c = --a + --b;
	System.out.println("The value of a :"+a +" The value of b :"+b+" The value of c :"+c);
}
}
