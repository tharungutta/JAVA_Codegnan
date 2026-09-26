package Files;

import java.io.FileInputStream;
                                                                   // try with resources ex
public class FileInputDemo1 {
	 public static void main(String[] args) {
		 try (FileInputStream fis = new FileInputStream("abc.txt"); ){
		 // fis --> abc.txt
		int n ;
		while((n = fis.read())!= -1 ) {
			System.out.println((char)n);
		}
		//fis.close();                                               // no need of manually cloing
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	}
}
