package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		 try {
		FileInputStream fis = new FileInputStream("abc.txt");  // fis --> abc.txt
		FileOutputStream fos = new FileOutputStream("xyz.txt",true);
		int n ;
		while((n = fis.read())!= -1 ) {
			System.out.println((char)n);
			fos.write(n);
		}
		fis.close();
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	}
}
