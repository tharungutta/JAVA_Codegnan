package Files;
import java.io.*;
public class FileDemo1 {
  public static void main(String[] args) throws IOException {
	File f1 = new File("abc");
	boolean value = f1.exists();
	System.out.println(value);
	boolean option = f1.mkdir();
	System.out.println(option);
}
}
