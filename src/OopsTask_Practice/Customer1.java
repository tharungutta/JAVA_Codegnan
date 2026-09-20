package OopsTask_Practice;

public class Customer1 {
	double bill = 10000;
	double discount = 0.0;
   void calDiscount() {
	   System.out.println("No discount");
   }
}
class RegCustomer extends Customer1{
	@Override
	void calDiscount() {
		discount  = bill*0.1;
		bill = bill -discount;
		System.out.println("discount :"+discount);
		System.out.println("Bill:"+bill);
	}
}
class PreCustomer extends Customer1{
	@Override
	void calDiscount() {
		discount  = bill*0.3;
		bill = bill -discount;
		System.out.println("discount :"+discount);
		System.out.println("Bill:"+bill);
	}
	public static void main(String[] args) {
		Customer1 c1 = new RegCustomer();
		c1.calDiscount();
		Customer1 c2 = new PreCustomer();
		c2.calDiscount();
	}
}
