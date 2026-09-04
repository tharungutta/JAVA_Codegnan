package Inheritance;

public class Company {
    protected int comId;
    protected String comName;
    
    Company(){
    	comId = 1001;
    	comName = "TCS";
    	System.out.println("This is grand Parent(Company class) non parameterized constructor");
    }
}
