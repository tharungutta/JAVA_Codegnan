package MultiThreading;
                                               // DeadLock Concept
public class Thread1  {
 synchronized void dispaly(Thread2 t2) {
	 System.out.println(Thread.currentThread().getName()+" child1 Entered");
	 t2.last();
	 try {
		 Thread.sleep(1000);
	 }catch(Exception e) {
		 System.out.println(e);
	 }
 }
 synchronized void last() {
	 System.out.println("Trying to call Thread1 class last method");
 }
}


class Thread2{
	synchronized void dispaly(Thread1 t1) {
		 System.out.println(Thread.currentThread().getName()+" child2 Entered");
		 t1.last();
		 try {
			 Thread.sleep(1000);
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	 }
	 synchronized void last() {
		 System.out.println("Trying to call Thread2 class last method");
	 }
}

class DeadLockMain extends Thread{
	Thread1 t1 = new Thread1();
	Thread2 t2 = new Thread2();
	DeadLockMain(){
		System.out.println(Thread.currentThread().getName() + "Entered");
		start();
		t2.dispaly(t1);
	}
	public void run() {
		t1.dispaly(t2);
	}
	public static void main(String[] args) {
		new DeadLockMain();
	}	
}