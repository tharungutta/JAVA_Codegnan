package Practice_self;

public class Ex1 {
     void m1() {
    	System.out.println("Parent");
    }
}
 class Ex2 extends Ex1{
	 @Override
	 void m1() {
		System.out.println("Child");
	}
}
class Main{
	public static void main(String[] args) {
		Ex1 e1 = new Ex2();
		e1.m1();
//		Ex2 e2 = (Ex2)e1;
//		e2.m1();
	}
}