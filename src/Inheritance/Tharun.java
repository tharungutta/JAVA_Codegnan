package Inheritance;

public class Tharun extends Google{
     protected String stuName;
     protected int stuId;
     
     Tharun(){
    	 stuName = "Tharun";
    	 stuId = 100;
    	 System.out.println("This is from parent class(Tharun) non parameterized constructor");
     }
     Tharun(String stuName, int stuId){
    	 super(456,"Banglore");
    	 this.stuName = stuName;
    	 this.stuId = stuId;
    	 System.out.println("This is from parent class(Tharun) parameterized constructor");
     }

}
