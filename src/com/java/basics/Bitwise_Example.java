package com.java.basics;
import java.util.Scanner;
public class Bitwise_Example {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a :");
	int a = sc.nextInt();
	System.out.println("Enter the value of b :");
	int b = sc.nextInt();
//	int res = a&b;
//	int res = a|b;
//	int res = a^b;
//	int res = a<<b;
	int res = a>>b;
	System.out.println(res);
}
}
