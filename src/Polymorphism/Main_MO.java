package Polymorphism;

public class Main_MO {
   public static void main(String[] args) {
	Shape_MO s1 = new Shape_MO();
	s1.area();
	int res = s1.area(10,20 );
	System.out.println("The value of res is :"+res);
	s1.area(4.05f);
}
}
