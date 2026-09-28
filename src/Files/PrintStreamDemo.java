package Files;

import java.io.PrintStream;

public class PrintStreamDemo {
  public static void main(String[] args) {
	PrintStream ps = new PrintStream(System.out);
	ps.print(100);
	ps.println(123.4f);
	ps.println("Hello");
	ps.println("true");
	float f1 = 100.345f;
//	ps.format("%f", f1);
	ps.printf("%.2f", f1);
	
}
}
