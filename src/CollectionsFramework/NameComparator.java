package CollectionsFramework;

import java.util.Comparator;

public class NameComparator implements Comparator<ArrayListDemo1>{
    @Override
    public int compare(ArrayListDemo1 o1, ArrayListDemo1 o2) {
    	return o1.geteName().compareTo(o2.geteName());
    }
}
