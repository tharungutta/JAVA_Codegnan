package Interface;

public interface Rectangle {
   int len = 10, bre = 20;
   void area();
   default void perimeter() {                    // only in interface we are creating default methods, here default is method not an access modifier
	   int res = 2*(len+bre);
	   System.out.println("The res is :"+res);
   }
   static void show() {                                                       // We cannot override the static methods
	   System.out.println("This is static method of rectangle interface");
   }
   private static void m1() {                                      // private methods also we can create in an interface , and call in same interface
	   System.out.println("This is private method in interface");
   }
   
   public static void main(String[] args) {
	m1();
}
}
