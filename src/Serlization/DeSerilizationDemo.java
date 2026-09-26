package Serlization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerilizationDemo {
   public static void main(String[] args)throws Exception{
	FileInputStream fis = new FileInputStream("sample.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Employee e1 = (Employee)ois.readObject();
	e1.display();
}
}
