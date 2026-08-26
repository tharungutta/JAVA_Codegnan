package com.java.basics;
import java.util.Scanner;
public class Ternary_example_3digits {
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int c = sc.nextInt();
	 String res =   ((a>b)&&(a>c))?"A is greater":((b>a)&&(b>c))?"Bis grater":((c>a)&& (c>b))?"C is grater":"no value is grater";
	 System.out.println(res);
	 sc.close();
}
}
