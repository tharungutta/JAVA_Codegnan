package classwork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ProductEntity implements Comparable<ProductEntity> {
  
   
private int id;
   private String name;
   private double price;
   public ProductEntity() {
	
   }
   public ProductEntity(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
   public int getId() {
	return id;
 }
 public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "ProductEntity [id=" + id + ", name=" + name + ", price=" + price + "]";
}
@Override
public int compareTo(ProductEntity o) {
	ProductEntity cp = (ProductEntity) this;
	ProductEntity op = (ProductEntity) o;
    if(cp.getPrice()> op.getPrice()) {
    	return -1;
    }else if(cp.getPrice()< op.getPrice()) {
    	return 1;
    }
    return 0;
}
@Override
public boolean equals(Object obj) {
	boolean areSame = false;
	ProductEntity cp = (ProductEntity) this;
	ProductEntity op = (ProductEntity) obj;
	
	int currentId = cp.getId();
	String currentName = cp.getName();
	double currentPrice = cp.getPrice();
	
	int otherId = op.getId();
	String otherName = op.getName();
	double otherPrice = op.getPrice();
	
	if(currentId == otherId  && currentName.equals(otherName) && currentPrice == otherPrice)  {
		areSame = true;
	}
	return areSame;
}
}

class EntityMain{
	public static void main(String[] args) {
		ProductEntity p1 = new ProductEntity(101, "Laptop", 50000);
//		ProductEntity p2 = new ProductEntity(102, "Mobile", 500);
		ProductEntity p2 = new ProductEntity(101, "Laptop", 50000);

		
		boolean areSame  = p1.equals(p2);
		System.out.println(areSame);
//		ProductEntity p3 = new ProductEntity(103, "Pad", 1500);
//		ProductEntity p4 = new ProductEntity(102, "Mobile", 500);
//		ProductEntity p5 = new ProductEntity(105, "Monitor", 12000);

//		TreeSet<ProductEntity> p = new TreeSet<>();
//		p.add(p1);
//        p.add(p3);
//        p.add(p5);
//        p.add(p2);
//        p.add(p4);
  
//        for (ProductEntity x : p) {
//            System.out.println(x);
//        }

	}
}
