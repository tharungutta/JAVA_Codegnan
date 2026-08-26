package com.java.basics;
import java.util.Scanner;
public class Test_Example {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the employee name : ");
	String name = sc.next();
	System.out.println("Enter the rate : ");
	double rate = sc.nextDouble();
	System.out.println("Enter the time : ");
	double hours = sc.nextDouble();
	double amount = rate *hours;
	System.out.println("Employee "+name +"Earned in $ "+amount);
}
}
