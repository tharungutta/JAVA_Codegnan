package Inheritance;

public class Shape_H {
    protected int len , bre , side;
    protected float radius;
    Shape_H(){
    	len = 10;
    	bre = 20;
    	side = 20;
    	radius = 20.10f;
    	System.out.println("This is super class(Shape) non parameterized constructor");
    }
    void display() {
    	System.out.println("The value of len :"+len);
    	System.out.println("The value of bre :"+bre);
    	System.out.println("The value of side :"+side);
    	System.out.println("The value of radius :"+radius);
    }
}
