package com.java.basics;

public class Typeacst_Narrowing {
  public static void main(String[] args) {
    // int a1 = 10;
   //  byte b1 = (byte)a1;     // Explicitly done by the programmer ( Narrowing)
    // System.out.println(b1);    // when we are converting long to float we have do it in narrowing process because  long = 8 bytes float = 4bytes
	  char c1 = 'a';
	  float f1 = c1;
	  System.out.println(f1);
}
}
