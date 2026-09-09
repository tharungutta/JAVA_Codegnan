package String_concept;

public class StringDemo {
   public static void main(String[] args) {
	String str1 = new String("Codegnan");       //Heap area    -- using new it will give create 2 different reference
	String str2 = "Codegnan";                  // String constant pool  -- refers to one memory location if use 2 same object creation
	
	String str3 = new String("Codegnan");
	String str4 = "Codegnan";
	
	
	if(str1 == str2) {                            // == is used to compare the reference in the string only
		System.out.println("Both are equal");
	}else {
		System.out.println("Both are not Equal");         // not equal , because the references are different
	} 
	
	
	
	if(str2 == str4) {                            // == is used to compare the reference in the string only
		System.out.println("Both are equal");
	}else {
		System.out.println("Both are not Equal");   // equal , because the references are same 
	}
	
	
	if(str1.equals(str2)) {                           // it is used to compare the hashcode values

		System.out.println("Both are equal");

		}else {

		System.out.println("Both are not Equal");

		}
	
	System.out.println(str1.hashCode());
	System.out.println(str2.hashCode());
	System.out.println(str3.hashCode());
	System.out.println(str4.hashCode());
	
}
}
