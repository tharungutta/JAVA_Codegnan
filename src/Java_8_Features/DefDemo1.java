package Java_8_Features;

interface Left{
	default void sleep() {
		System.out.println("Sleep left direction");
	}
}
interface Right{
	default void sleep() {
		System.out.println("Sleeep right direction");
	}
}
public class DefDemo1 implements Left, Right{
   @Override
   public void sleep() {
	   Left.super.sleep();
	   Right.super.sleep();
	   System.out.println("My own direction");
   }
   public static void main(String[] args) {
	DefDemo1 d = new DefDemo1();
	d.sleep();
}
}
