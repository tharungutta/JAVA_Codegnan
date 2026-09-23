package MultiThreading;
                                                                         //Dead lock ex
public class Student1 {
    synchronized void javaBookReceived(Student2 s2) {
    	String name = Thread.currentThread().getName();
    	System.out.println(name +"Thread Entered");
    	try {
    		Thread.sleep(1000);
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	s2.JBookReceived();
    }
    synchronized void SBookReceived() {
    	System.out.println("Studen1 sql block statement");
    }
}


class Student2{
	synchronized void sqlBookReceived(Student1 s1) {
    	String name = Thread.currentThread().getName();
    	System.out.println(name +" clild Thread Entered");
    	try {
    		Thread.sleep(1000);
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	s1.SBookReceived();
    }
    synchronized void JBookReceived() {
    	System.out.println("Studen2 java block statement");
    }
}

class Library_main extends Thread{
	
		Student1 s1 = new Student1();
		Student2 s2 = new Student2();
		Library_main(){
			start();
			s1.javaBookReceived(s2);
		}
		@Override
		public void run() {
			s2.sqlBookReceived(s1);
		}
		public static void main(String[] args) {
			Library_main lm = new Library_main();
		}	
}