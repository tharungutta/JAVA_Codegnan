package String_concept;

public class StringBufferDemo {
    public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer();   // capacity = 16 , length = 0    default
		System.out.println("Capacity is:"+str1.capacity());
		System.out.println("Length is :"+str1.length());
		
		str1.append("Codegnan");
		
		System.out.println("Capacity is:"+str1.capacity());
		System.out.println("Length is :"+str1.length());
		
		str1.trimToSize();                               // used to decrease the capacity to length size
		
		System.out.println("Capacity is:"+str1.capacity());
		System.out.println("Length is :"+str1.length());
		
		System.out.println("***************************************************************************");
		StringBuffer str2 = new StringBuffer(10);          // capacity = 10
		
		System.out.println("Capacity is:"+str2.capacity());  //10
		System.out.println("Length is :"+str2.length());  //0
		
		str2.append("Codegnan");
		System.out.println("Capacity is:"+str2.capacity());//10
		System.out.println("Length is :"+str2.length());//8

		str2.trimToSize();                               // used to decrease the capacity to length size

		
		System.out.println("Capacity is:"+str2.capacity());//8
		System.out.println("Length is :"+str2.length());//8
		
		System.out.println("*******************************************************************************");
		
		StringBuffer str3 = new StringBuffer("Tharun");  // Capacity = 16+ length of the string

		System.out.println("Capacity is:"+str3.capacity());  //22
		System.out.println("Length is :"+str3.length());  //6
		
		
	}
}
