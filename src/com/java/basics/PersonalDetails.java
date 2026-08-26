package com.java.basics;
 import java.util.Scanner;
public class PersonalDetails {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the name : ");
	    String name = sc.nextLine();
	    System.out.println("Enter the age: ");
	    int age = sc.nextInt();
	    System.out.println("Enter your gender : ");
	    char gender = sc.next().charAt(0);
	    System.out.println("Enter your mobile number :");
	    long mob = sc.nextLong();
	    System.out.println("Are you married True/False : ");
	    boolean married = sc.nextBoolean();
	    System.out.println("*************************");
	    System.out.println("Name :"+ name);
	    System.out.println("Age :"+age);
	    System.out.println("Gender :"+gender);
	    System.out.println("Mobile num :"+mob);
	    System.out.println("Married :"+married);
} 

}
