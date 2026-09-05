package Polymorphism;
                                                        //Method Overriding
public class Manager extends Employee {
   protected float ta , da;
   
   Manager(){
	   ta = 100.0f;
	   da = 200.0f;
	   System.out.println("This is sub class manger constructor");
   }
 @Override                                             // is an annotation to tell the complier we are overriding the method, it is optional.
   void calSal() {      // overriding method
	   float res = ta + da+ empsal;
	   System.out.println("The value of overriding method is :"+res);
   }
}




// To override the visibility of sub class is higher then the super class , we can't use private modifiers in overriding because they can access only in class. 