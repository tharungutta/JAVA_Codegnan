package Inheritance;

public class Shape {
    protected float length;
    protected float breadth;
    Shape(){
    	 length = 1.01f;
    	 breadth = 2.01f;
    	System.out.println("This is super class non- parameterized constructor");
    }
    
    Shape(float f1 , float f2){
   	 length = 7.01f;
   	 breadth = 8.01f;
   	System.out.println("This is super class  parameterized constructor");
   }
    
    void display() {
    	System.out.println("This is super class length:"+length);
    	System.out.println("This is super class breadth:"+breadth);
    }
}
