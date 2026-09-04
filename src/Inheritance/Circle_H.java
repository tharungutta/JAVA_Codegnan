package Inheritance;

public class Circle_H extends Shape_H{

	Circle_H(){
    	System.out.println("This is circle class non paramerized constructor");
    }
    
    void area() {
    	float res  =3.14f * radius* radius;
    	System.out.println("The value of circle res is:"+res);
    }
}
