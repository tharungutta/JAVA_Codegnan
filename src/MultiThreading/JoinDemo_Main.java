package MultiThreading;

public class JoinDemo_Main {
   public static void main(String[] args) {
	JoinDemo j1 = new JoinDemo();
	JoinDemo j2 = new JoinDemo();
	j1.setName("Thread1");
	j2.setName("Thread2");
	j1.start();
	try {
		j1.join(100000);      // join() must be written in try catch block or else we get exception., it is used to execute first thread before after that only 2nd thread
	}catch(Exception e) {
		System.out.println(e);
	}
	j2.start();
	
}
}
