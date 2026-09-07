package Abstraction;

public class Rectangle extends Shape {
	
	Rectangle(){
		System.out.println("This is sub class rectangle constructor");
	}

	@Override
	void area() {
		int res = len*bre;
		System.out.println("The value is :"+res);
	}
	
	void perimeter() {
		int res = 2*(len+bre);
		System.out.println(res);
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.area();
		r1.display();
		r1.perimeter();
		
		Shape s1 ; // super class reference variable s1 = null
	//	s1.display();
		
		s1 = r1;                  // reference of subclass is assigned to super class reference variable
		s1.display();
		s1.area();
	//	s1.perimeter();           // error because the reference is on the super class ,we cannot call sub class methods
	}
}
// Note : super class object cannot be assigned to sub class reference variable , it does not allowed. 