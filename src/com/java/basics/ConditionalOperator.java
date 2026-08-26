package com.java.basics;
import java.util.Scanner;
public class ConditionalOperator {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b= sc.nextInt();
//	int c = (a<b)?a:b ;
//	int c = (a>b)?a:b ;
//	System.out.println("The value of c :"+c);
	String option = (a<b)? "a is less then b":(b<a)?"b is less than a ":(a == b)?"Both are equal":"No statements";     // Nested conditional operator
	System.out.println(option);
}
}
