package MultiThreading;

public class CurrentThread_Demo {
   public static void main(String[] args) {
	Thread t = Thread.currentThread();
	System.out.println(t);
	t.setName("Thread1");
	t.setPriority(1);
	System.out.println(t);
}
}
