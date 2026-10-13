package Java_8_Features;

// Without lamda

//class MyRunnable implements Runnable{
//	public void run() {
//		for(int i=0; i<=10;i++) {
//			System.out.println("Seetha thread");
//		}
//	}
//}
public class Runnable_Demo {
   public static void main(String[] args) {
	   
	   Runnable mr = ()-> {                                          // with Lamda
		   for(int i=0;i<=10;i++) {
			   System.out.println("Seetha Thread");
		   }
	   };
	   
//	   MyRunnable mr = new MyRunnable();
	   Thread t = new Thread(mr);
	   t.start();
	   
	for(int i=0;i<=10;i++) {
		System.out.println("Rama Thread");
	}
}
}
