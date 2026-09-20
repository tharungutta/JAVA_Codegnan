package OopsTask_Practice;

public class Calculator {
   public void add(int a, int b) {
	   System.out.println("A:"+a);
	   System.out.println("B:"+b);
   }
   public void add(double c, double d) {
	   System.out.println("C"+c);
	   System.out.println("D:"+d);
   }
   public void add(int e, int f, int g) {
	   System.out.println("E:"+e);
	   System.out.println("F:"+f);
	   System.out.println("G:"+g);
   }
   public static void main(String[] args) {
	Calculator c1 = new Calculator();
	c1.add(10, 20);
	c1.add(10, 20,30);
	c1.add(10.0, 20.0);
}
}
