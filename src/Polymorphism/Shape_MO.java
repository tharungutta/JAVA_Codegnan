package Polymorphism;
                                                            // Method overloading 
public class Shape_MO {
	
	private  int side;
	
	Shape_MO(){
	   side = 10;
	   System.out.println("This is shape class constructor");
	}
	 void area() {
		int res = side * side ;
		System.out.println("the res value is :"+res);
	}
	 int area(int len , int bre) {
		int res = len * bre;
		return res;
	}
     void area(float radius) {
		float res = 3.14f * radius * radius;
		System.out.println("The circle res value is :"+res);
	}
}
