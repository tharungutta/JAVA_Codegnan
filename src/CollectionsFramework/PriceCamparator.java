package CollectionsFramework;

import java.util.Comparator;

public class PriceCamparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		 return Double.compare(o1.getpPrice(), o2.getpPrice());
	
	}
}
