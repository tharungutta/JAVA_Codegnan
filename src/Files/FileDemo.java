package Files;

import java.io.File;
import java.io.IOException;

public class FileDemo {
   public static void main(String[] args)throws IOException {
	File f1 = new File("abc.txt");
	
	boolean value = f1.exists();
	System.out.println(value);
	
	boolean b1 = f1.createNewFile();
	System.out.println(b1);
	
	System.out.println("The file path is "+f1.getPath());
	System.out.println(f1.getAbsolutePath());
	System.out.println("The parent file is "+f1.getParent());
	System.out.println("Check readable : "+f1.canRead());
	System.out.println("Writable or not: "+f1.canWrite());
	System.out.println(f1.getTotalSpace());
	System.out.println(f1.getFreeSpace());
	System.out.println(f1.getUsableSpace());
	
	System.out.println(File.pathSeparator);
	System.out.println(File.separator);
}
}
