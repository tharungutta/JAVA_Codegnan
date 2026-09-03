package Inheritance;

public class Rectangle extends Shape{
   protected float length1 , breadth1;
    Rectangle(){
    	 length1 = 3.01f;
    	 breadth1 = 4.01f;
    	System.out.println("This is sub class non- parameterized constructor");

    }
    
    Rectangle(float f1, float f2){
    super(7.00f,8.00f);
   	 length1 = 7.01f;
   	 breadth1 = 8.01f;
   	System.out.println("This is sub class parameterized constructor");
   }
    
    void area(){
    	float area1 = length * breadth;
    	float area2 = length1 * breadth1;
    	System.out.println("Area of rec 1 :"+area1);
    	System.out.println("Area of rec2 : "+area2);
    }
    public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.display();
		r1.area();
		Rectangle r2 = new Rectangle(5.00f, 6.00f);
		r2.display();
		r2.area();
	}
}
