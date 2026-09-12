package Exception_Handling;

public class ProductInfo {
   public static void main(String[] args) {
	String [] products = {"Laptops","Mouses","pendrives","Ram"};
	int noOfPro = products.length;
	Integer qty = null;
	try {
		//System.out.println(products[5]);
		int total = noOfPro * qty;       // java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "qty" is null
		
		
		// we can write as many exception rising statements in try block, but only first one will execute.
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("AIOOBE");
	}
	catch(Exception e) {
		System.out.println("another exception");
		//System.out.println(e);                           //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
		//e.printStackTrace();                             // at SampleProject/Exception_Handling.ProductInfo.main(ProductInfo.java:7)
	}
}
}
