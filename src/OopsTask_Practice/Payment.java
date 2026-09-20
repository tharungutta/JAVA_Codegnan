package OopsTask_Practice;

public interface Payment {
  void makePayment();
}
class UPIPayment implements Payment{
	@Override
	 public void makePayment() {
		System.out.println("paying through upi");
	}
}
class CardPayment implements Payment{
	@Override
	public void makePayment() {
		System.out.println("Paying through card");
	}
}
class CashPayment implements Payment{
	@Override
	public void makePayment() {
		System.out.println("Paying through cash");
	}
	public static void main(String[] args) {
		Payment p1 = new UPIPayment();
		p1.makePayment();
		Payment p2 = new CardPayment();
		p2.makePayment();
		Payment p3 = new CashPayment();
		p3.makePayment();
	}
}