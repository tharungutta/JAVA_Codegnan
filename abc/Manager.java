package Interface;

public class Manager implements Employee {
	int ta, da;
   Manager(){
	   ta = 1000;
	   da = 2000;
	   System.out.println("This is a manager class constructor");
   }
   @Override
   public void display() {                                        // here the aceess modifier must be public 
	   System.out.println("The empNo is:"+empNo);
	   System.out.println("The empSal is :"+empSal);
   }
   @Override
   public void calSal() {
	   int netSal = ta+da+empSal;
	   System.out.println(netSal);
   }
}
