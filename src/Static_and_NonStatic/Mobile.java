package Static_and_NonStatic;

public class Mobile {
   int mobileId;
   float mobilePrice;
   float modelNum;
   
   
 private  Mobile(){                // here constructor is private 
	  mobileId = 10;
	  mobilePrice = 4000;
	  modelNum = 300;
	 System.out.println("Private constructor called");
   }
   Mobile(int mobileId, float mobilePrice, float modelNum){    
	   this(); 
	   
//	   this.mobileId = mobileId;
//	   this.mobilePrice = mobilePrice;
//	   this.modelNum = modelNum;
   }
  private  void display(){
	   System.out.println(mobileId);
	   System.out.println(mobilePrice);
	   System.out.println(modelNum);
   }
   void show(){
	   this.display();
   }

}
