package String_concept;

public class StringBufferDemo1 {
   public static void main(String[] args) {
	StringBuffer str1 = new StringBuffer("Codegnan");
	
	System.out.println(str1.substring(3));               // substring -- to print the string from that index to the end , 3- inclusive 
	System.out.println(str1.substring(3, 7));            // here 3 inclusive , 7 is exclusive
	System.out.println(str1.toString());                // toString()- is used to convert into string , which is immutable
	
	str1.setCharAt(0, 'c');
	System.out.println(str1);
	
	System.out.println(str1.delete(4, 8));
	
	System.out.println(str1.reverse());
	
}
}
