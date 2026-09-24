package Interface;

public class Shape implements Rectangle, Circle{
   @Override                                                       // Multiple inheritance using interface   -- have same methods in both interfaces.
   public void area() {
	   int res1 = len*bre;
	   float res2 = 3.14f* radius *radius;
	   System.out.println("the value of res1:"+res1);
	   System.out.println("The value of res2:"+res2);
   }
   @Override
   public void perimeter() {
	   Rectangle.super.perimeter();
	   Circle.super.perimeter();
   }
    

   public static void main(String[] args) {
	Shape s1 = new Shape();
	s1.area();
	Rectangle.show();
	Circle.show();
}
}
