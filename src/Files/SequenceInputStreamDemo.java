package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {
   public static void main(String[] args) throws Exception{

	 FileInputStream fis1 = new FileInputStream("abc.txt");
	 FileInputStream fis2 = new FileInputStream("sample.txt");
//	 FileInputStream fis3 = new FileInputStream("abc1.txt");
	 FileOutputStream fos = new FileOutputStream("xyz.txt");
	 SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
	 
	 int n;
	 while((n = sis.read())!= -1) {
		 System.out.println(n);
		 fos.write(n);
	 }
	 fis1.close();
	 fis2.close();
	 sis.close();
	 fos.close();
}
}
