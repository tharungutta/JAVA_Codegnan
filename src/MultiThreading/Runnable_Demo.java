package MultiThreading;

public class Runnable_Demo implements Runnable {
    @Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("The value of  i is"+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
