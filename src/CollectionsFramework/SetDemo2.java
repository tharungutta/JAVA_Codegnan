package CollectionsFramework;

public class SetDemo2 {
   int productId;
   String productName;

   public SetDemo2(int productId, String productName) {
	super();
	this.productId = productId;
	this.productName = productName;
}
   
   public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}

@Override
public String toString() {
	return "SetDemo2 [productId=" + productId + ", productName=" + productName + "]";
}
   
}

