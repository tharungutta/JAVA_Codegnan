package MultiThreading;

public class Runnable_MAin {
   public static void main(String[] args) {
	Runnable_Demo rd = new Runnable_Demo();
	Thread t1 = new Thread(rd);
	t1.start();            //
	rd.run();                  // excplictly calling the run method
}
}
