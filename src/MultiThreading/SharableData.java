package MultiThreading;
                               // producer and consumer problem [very imp]
public class SharableData {
   int value;
   boolean available = false;
   synchronized void writeData(int value) {
	   try {
		   while(available) {
			   wait();
		   }
		   this.value = value;
		   available = true;
		   System.out.println("Written value"+value);
		   notify();                                              // it is a method which will tell another thread to execute
	   }catch(Exception e) {
		   System.out.println(e);
	   }
   }
   synchronized void readData() {
	   try {
		   while(!available) {
			   wait();
		   }
		   int data = value;
		   available = false;
		   System.out.println("Read data"+data);
		   notify();
	   }catch(Exception e) {
		   System.out.println(e);
	   }
   }
}


class Producer extends Thread {
	 SharableData s1;
	 Producer(SharableData s1){
		 this.s1 = s1;
	 }
	 @Override
	 public void run() {
		 for(int i=0;i<10;i++) {
			 s1.writeData(i);
		 }
	 }
}


class Consumer extends Thread{
	SharableData s1;
	Consumer(SharableData s1){
		this.s1 = s1;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			s1.readData();
		}
	}
}

class Sync_main {
	public static void main(String[] args) {
		SharableData s1 = new SharableData();
		Producer p1 = new Producer(s1);
		Consumer c1 = new Consumer(s1);
		p1.start();
		c1.start();
	}
}