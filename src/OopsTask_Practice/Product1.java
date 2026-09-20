package OopsTask_Practice;
import java.util.*;
public class Product1 {
   private String productName;
   private double price;
   private int stock;
   public void setproductName(String productName) {
	   this.productName = productName;
   }
   public String getproductName() {
	   return productName;
   }
   public void setprice(double price) {
	   this.price = price;
   }
   public double getprice() {
	   return price;
   }
   public void addStock(int quantity) {
	   stock += quantity;
   }
   public void removeStock(int quantity) {
	   if(quantity<=stock) {
		   stock -= quantity;
	   }else {
		   System.out.println("Out of stock, enter the stock below:"+stock);
	   }
   }
   public void displayStock() {
	   System.out.println("Stock was there:"+stock);
   }
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Product1 p1 = new Product1();
	System.out.println("Enter the stock:");
	p1.addStock(sc.nextInt());
	System.out.println("Enter the removed stock:");
	p1.removeStock(sc.nextInt());
	p1.setproductName("Mobiles");
	p1.setprice(10000);
	System.out.println(p1.getproductName());
	System.out.println(p1.getprice());
	p1.displayStock();
}
}
