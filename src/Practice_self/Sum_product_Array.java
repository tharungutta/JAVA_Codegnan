package Practice_self;

public class Sum_product_Array {
   public static void main(String[] args) {
	int [] a = {1,2,3,4};
	int sum = 0;
	int product = 1;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2 ==1) {
			sum = sum+a[i];
			product = product*a[i];
		}
	}
	System.out.println(sum);
	System.out.println(product);
}
}
