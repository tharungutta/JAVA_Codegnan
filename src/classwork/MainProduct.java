package classwork;

import java.util.HashSet;

public class MainProduct {
  public static void main(String[] args) {
	  ProductOperations p = new ProductOperations();
	  
	     HashSet<Product> products = p.getProducts();
	     for(Product product: products) {
	    	 System.out.println(product);
	     }
	     
	     System.out.println();
	     
	     boolean isProductAdded = p.addProduct(6, "Mobile", 200000);
		  if(isProductAdded) {
			  System.out.println("Product added successfully");
		  }else {
			  System.out.println("Product not added successfully");
		  }
		  System.out.println();
		  
		  products = p.getProducts();
		  for(Product product : products) {
			  System.out.println(product);
		  }
		  
		  
		     boolean isProductPriceUpdated = p.updateProductPrice(1, 10000);

		  
	  
//	  p.displayProducts();
//	  
//	  boolean isProductAdded = p.addProduct(1, "Mobile", 200000);
//	  if(isProductAdded) {
//		  System.out.println("Product added successfully");
//	  }else {
//		  System.out.println("Product not added successfully");
//	  }
//	  System.out.println();
//	  p.displayProducts();
//	  System.out.println();
	  
//	   isProductAdded = p.addProduct(2, "Book", 200000);
//	  if(isProductAdded) {
//		  System.out.println("Product added successfully");
//	  }else {
//		  System.out.println("Product not added successfully");
//	  }
//	  System.out.println();
//	  p.displayProducts();
//	  System.out.println();
	  
//	  isProductAdded = p.addProduct(3, "Laptop", 200000);
//	  if(isProductAdded) {
//		  System.out.println("Product added successfully");
//	  }else {
//		  System.out.println("Product not added successfully");
//	  }
//	  System.out.println();
//	  p.displayProducts();
//	  System.out.println();
	  

//     
//     Product product = p.findProductById(2);
//     if(product != null) {
//    	 System.out.println("Product found succesfully by id:"+product.getId());
//     }else {
//    	 System.out.println("Product not found");
//     }
//     
//     
//     Product p1 = p.findProductByName("Tharun");
//     if(p1 != null) {
//    	 System.out.println("Product found by name:"+p1.getName());
//     }else {
//    	 System.out.println("Product is not found by name");
//     }
}
   
}
