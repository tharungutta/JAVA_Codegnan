package Static_and_NonStatic;

public class Product {
   int productId;
   float productPrice;
   float productQty;
   
  Product(){                             // NO Argument constructor or Non Parameterized constructor
	   productId = 10;
	   productPrice = 100.99f;
	   productQty = 1000f;   
	   System.out.println("Fron non parametrized");
   }
   
   Product(int a , float f1 , float f2){    
	   this();                                                           // Parameterized constructor
	   productId = a;
	   productPrice = f1;
	   productQty = f2;   
	   System.out.println("From parameterized");
   }
   
   Product(Product p3){                             //Copy constructor

	   productId = p3.productId;
	   productPrice = p3.productPrice;
	   productQty = p3.productQty;   
	   System.out.println("From copy constructor");
   }
  void display() {
	  System.out.println(productId);
	  System.out.println(productPrice);
	  System.out.println(productQty);
  }
}
