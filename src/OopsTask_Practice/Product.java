package OopsTask_Practice;

public class Product {
   int productId;
   String productName;
   int price;
   Product(int productId, String productName, int price){
	   this.productId = productId;
	   this.productName = productName;
	   this.price = price;
   }
   void display() {
	   System.out.println("Product id:"+productId);
	   System.out.println("Product Name:"+productName);
	   System.out.println("Price:"+price);
   }
}
class ElectronicProduct extends Product{
	int warrantyYears;
	ElectronicProduct(int warrantyYears){
		super(100,"Moto",100000);
		this.warrantyYears = warrantyYears;
	}
	void show() {
		System.out.println("Warranty Years:"+warrantyYears);
	}
	public static void main(String[] args) {
		ElectronicProduct e1 = new ElectronicProduct(10);
		e1.display();
		e1.show();
	}
}

