package Files;


	import java.io.File;
    import java.io.FileInputStream;                              // Enumeration - used to read more than 2 files  
	import java.io.FileOutputStream;
	import java.io.SequenceInputStream;
    import java.util.Enumeration;
    import java.util.Vector;

	public class SequenceInputDemo1 {
	   public static void main(String[] args) throws Exception{
        
		 FileInputStream fis1 = new FileInputStream("abc.txt");
		 FileInputStream fis2 = new FileInputStream("sample.txt");
		 File f1 = new File("abc1.txt");
		 f1.createNewFile();
		 FileInputStream fis3 = new FileInputStream("abc1.txt");
		 FileOutputStream fos = new FileOutputStream("xyz.txt");
		 
		 Vector a1 = new Vector();
		 a1.add(fis1);
		 a1.add(fis2);
		 a1.add(fis3);
		 
		 Enumeration e1 = a1.elements();
		 int n;
		 
		 SequenceInputStream sis = new SequenceInputStream(e1);
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
