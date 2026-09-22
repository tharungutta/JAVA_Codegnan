package MultiThreading;
                                                      // DeadLock ex-2
public class Customer1 {
   synchronized void callMe(Customer2 c2) {
	   System.out.println("Customer1 Thread");
	   try {
		   Thread.sleep(1000);
	   }catch(Exception e) {
		   System.out.println(e);
	   }
	   c2.show();
   }
   synchronized void display() {
	   	System.out.println("Display method from customer1 class");
   }
}


class Customer2{
	synchronized void callMe(Customer1 c1) {
		System.out.println("Customer2 Thraed");
		try {
			 Thread.sleep(1000);
		}catch(Exception e) {
			 System.out.println(e);
		}
		c1.display();
	}
	synchronized void show() {
		System.out.println("Show method from customer2");
	}
}

class DeadLock extends Thread {
	Customer1 c1 = new Customer1();
	Customer2 c2 = new Customer2();
	DeadLock(){
		System.out.println("Main Thread");
		start();
		c1.callMe(c2);
	}
	public void run() {
		c2.callMe(c1);
	}
	public static void main(String[] args) {
		new DeadLock();
	}
}

