package MultiThreading;

public class MultiThreadMain {
     public static void main(String[] args) {
		Multithread_Demo t1 = new Multithread_Demo();
		Multithread_Demo t2 = new Multithread_Demo();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.setPriority(5);
		t2.setPriority(1);
		t1.start();

		t2.start();
	}
}
