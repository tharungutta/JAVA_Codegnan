package CollectionsFramework;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Product {
  private  int pId ;
  private  String pName;
  private  double pPrice;
  public Product() {
	  
  }
  public Product(int pId, String pName, double pPrice) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.pPrice = pPrice;
}

  @Override
  public String toString() {
  	return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
  }
  
  public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public double getpPrice() {
	return pPrice;
}
public void setpPrice(double pPrice) {
	this.pPrice = pPrice;
}

}

class LinkedListDemo2 extends Product {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(new Product(123, "pen", 10));
		l1.add(new Product(456,"pencil",5));
		l1.add(new Product(789,"book",50));
		l1.add(new Product(567,"laptop",50000));
			
		System.out.println("List values are:"+l1);
		
		ListIterator lit = l1.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		l1.sort(new PriceCamparator());        // sorting based on price , using PriceCamparator class while implements the comparator interface
		System.out.println(l1);
		
	}
}
