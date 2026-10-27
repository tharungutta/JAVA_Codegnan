package classwork;

import java.util.HashSet;
import java.util.Iterator;

public class ProductOperations {
    private HashSet<Product> products = new HashSet<>();
    
    public ProductOperations() {
		Product product1 = new Product(1, "Tharun",100);
		Product product2 = new Product(2, "Teja",11);
		Product product3 = new Product(3, "Bhuvi",122);
		Product product4 = new Product(4, "Revanth",67);
		Product product5 = new Product(5, "Yesh",101);
		
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
	}
    
    public boolean updateProductPrice(int productId, double newPrice) {
    	boolean isUpdated = false;
          Iterator<Product> iterator = products.iterator();
    		while(iterator.hasNext()) {
    			Product product = iterator.next();
    			if(product.getId() == productId) {
        			 product.setPrice(newPrice);
        			 isUpdated = true;
        			 break;
        		 }
    		}
    	return isUpdated;
    }
    
    public boolean deleteProduct(int productId) {
    	boolean isDeleted = false;
    	Product foundProduct = null;
    	for(Product product : products) {
    		if(product.getId() == productId) {
    			foundProduct = product;
    			break;
    		}
    	}
    	if(foundProduct != null) {
    		isDeleted = products.remove(foundProduct);
    	}
    	return isDeleted;
    }
    
    // Add the product to the inventory
    public boolean addProduct(int productId , String name, double price) {
    	boolean isAdded = false;
    	isAdded = products.add(new Product(1, "mobile", 1000));
    	return isAdded;
    }
    
    // Display all the products to the inventory
    public void displayProducts() {
    	for(Product product : products) {
    		System.out.println(product);
    	}
    }
 
    
    public HashSet<Product> getProducts(){
    	return products;
    }
    
    public Product findProductById(int productId) {
        for(Product product: products) {
        	if(product.getId() == productId) {
        		return product;
        	}
        }
    	return null;
    }
    
    public Product findProductByName(String productName) {
    	 for(Product product: products) {
         	if(product.getName().equals(productName)) {
         		return product;
         	}
         }

    	return null;
    }
    
}
