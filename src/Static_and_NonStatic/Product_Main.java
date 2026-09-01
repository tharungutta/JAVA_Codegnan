package Static_and_NonStatic;

public class Product_Main {
   public static void main(String[] args) {
	Product p1 = new Product();      // Calling non -parameterized constructor or no argument constructor
	p1.display();
	Product p2 = new Product(101,123.4f,1001.4f);    // calling parameterized constructor
	p2.display();
	Product p3 = new Product(p1);       // coping data from one constructor to another 
	p3.display();
}
}
