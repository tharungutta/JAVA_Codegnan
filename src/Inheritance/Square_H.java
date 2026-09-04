package Inheritance;

public class Square_H extends Shape_H {
    Square_H(){
    	System.out.println("This is square class non paramerized constructor");
    }
    
    void area() {
    	int res = side*side;
    	System.out.println("The value of Square res is:"+res);
    }
}
