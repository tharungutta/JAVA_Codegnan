package Interface;

public interface Circle {
  float radius = 30.14f;
  void area();
  default void perimeter() {
	  float res = 2*3.14f*radius;
	 System.out.println("The value of res is:"+res); 
  }
  static void show() {
	  System.out.println("This is static method circle interface");
  }
}
