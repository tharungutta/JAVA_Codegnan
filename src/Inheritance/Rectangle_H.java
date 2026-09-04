package Inheritance;

public class Rectangle_H extends Shape_H {
	Rectangle_H(){
    	System.out.println("This is Rectangle class non paramerized constructor");
    }
    
    void area() {
    	int res = len * bre;
    	System.out.println("The value of  rectangle res is:"+res);
    }
}
