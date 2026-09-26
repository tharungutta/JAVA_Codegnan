package Files;
import java.io.FileInputStream;
public class FileInputDemo {
 public static void main(String[] args) {
	 try {
	FileInputStream fis = new FileInputStream("abc.txt");  // fis --> abc.txt
	int n ;
	while((n = fis.read())!= -1 ) {
		System.out.println((char)n);
	}
	fis.close();
	 }catch(Exception e) {
		 System.out.println(e);
	 }
}
}
