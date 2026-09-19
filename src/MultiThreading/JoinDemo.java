package MultiThreading;

public class JoinDemo extends Thread {
   public void run() {
	   try {
		   for(int i = 0;i<10;i++) {
			   System.out.println(getName()+" "+i);
			   Thread.sleep(1000);
		   }
	   }catch(Exception e) {
		   System.out.println(e);
	   }
   }
}
