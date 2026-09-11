package String_concept;

public class StringDemo_2 {
   public static void main(String[] args) {
		String str1 = new String("Codegnan");
      	System.out.println(str1.concat(" IT solutions"));
	//	System.out.println(str1+(" IT solutions"));
		
		System.out.println(str1.charAt(2));
//		System.out.println(str1.charAt(-1));            //   java.lang.StringIndexOutOfBoundsException
		
		System.out.println(str1.codePointAt(0));           // character unique code value    
		
		System.out.println(str1.indexOf('a'));
		
		System.out.println(str1.lastIndexOf('n'));         // last index of similar alphabets
	
		System.out.println(str1);
		
		
		
		char ch[]= {'a','r','t'};
		String str2 = String.valueOf(ch);                 // object creation using factory method
		System.out.println(str2);
		
		String str3 = "Java full stack class";
		String arr[] = str3.split(" ");                 // split()-- it is used make the words in the sentence wherever it have space
 		for(String str: arr) {
			System.out.println(str);
		}
 		
 		
 		System.out.println(str1.compareTo(str3));     // Compare C-67 and J-74    ans : -7
 		
 		
 		byte []b1 = str1.getBytes();                                // getByte()-- used to convert string to byte array
 		for(byte a:b1) {
 			System.out.println(a);
 		}
 		
 		
 		char[] str5 = str1.toCharArray();
 	    
 }
}
