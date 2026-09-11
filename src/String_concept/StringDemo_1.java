package String_concept;

public class StringDemo_1 {
  public static void main(String[] args) {
	String str1 = new String("Codegnan");
	String str2 = "Codegnan";
	String str3 = str1.intern();    //intern() -- it is a method is used to convert an object from heap area to string constant pool
	if(str3 == str2) {
		System.out.println("Both are equal");
	}else {
		System.out.println("Not equal");
	}
	
	
}
}
