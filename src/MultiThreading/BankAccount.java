package MultiThreading;
//                                                         synchronized example
public class BankAccount {
   int bal = 10000;
   synchronized void withdraw(int amount) {
	   if(amount <=bal) {
		   bal -= amount;
		   System.out.println(Thread.currentThread().getName()+"  is withdrawing :"+amount);
		   System.out.println("The balance amount:"+bal);
	   }else {
		   System.out.println("Insufficent funds");
	   }
   }
}

 class Customer extends Thread {
	BankAccount b1 ;
    Customer(BankAccount b1){
    	this.b1 = b1;
    }
    @Override
    public void run() {
    	b1.withdraw(10000);
    }
}

class Synchronized_main{
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		Customer c1 = new Customer(bank);
		Customer c2 = new Customer(bank);
		c1.setName("Thread1");
		c1.setName("Thread2");
		c1.start();
		c2.start();
	}
}