package Static_and_NonStatic;

public class Static_Ex {
  int num1;               // non static variable
  static int num2;       // static variable
  static {
	  System.out.println("This is multiline static intilalizer");
  }
  Static_Ex(){
	  num1 = 100;
	  System.out.println("This is constructor");
  }
  void display() {                                           // non static method
	  System.out.println("The value of num1 is:"+num1);
  }
  static void show() {
	  System.out.println("This is static method");
  }
}
