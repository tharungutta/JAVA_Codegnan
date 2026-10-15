package Java_8_Features;

  interface Payment{
	  public void pay(double amount);
	  default void generate() {
		  System.out.println("Biil generated");
	  }
  }
  
  class UpiPayment implements Payment{
	  public void pay(double amount) {
		  System.out.println("Ammount paid : "+100);
	  }
	  @Override
	  public void generate() {
		  System.out.println("upi bill generated");
	  }
  }

public class DefaultDemo {
  public static void main(String[] args) {
	UpiPayment u = new UpiPayment();
	u.pay(100);
	u.generate();
	
}
}
