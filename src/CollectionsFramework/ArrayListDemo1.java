
package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
  private int eno;
  private String eName;
  private int eSal;
  public ArrayListDemo1() {
	  
  }
  public ArrayListDemo1(int eno, String eName, int eSal) {
	super();
	this.eno = eno;
	this.eName = eName;
	this.eSal = eSal;
  }
  
  @Override
  public String toString() {
  	return "ArrayListDemo1 [eno=" + eno + ", eName=" + eName + ", eSal=" + eSal + "]";
  }
  
    public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSal() {
		return eSal;
	}
	public void seteSal(int eSal) {
		this.eSal = eSal;
	}

}


class ArrayListDemo extends ArrayListDemo1{
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(new ArrayListDemo1(120, "Tharun",123456));
		a1.add(new ArrayListDemo1(140, "Karri",123467));
		a1.add(new ArrayListDemo1(160, "Ramu",123789));
		a1.add(new ArrayListDemo1(180, "Mehabooba",156756));
		a1.add(new ArrayListDemo1(190, "Teja",120987));
		
		a1.sort(new NameComparator());
		System.out.println(a1);
		
		ArrayListDemo1 obj = (ArrayListDemo1) a1.get(2);
		
		System.out.println("Old object value:"+obj);
		obj.setEno(2000);
		obj.seteName("XXXX");
		System.out.println("New Object valus:"+obj);
		
		a1.set(2, "ZERO");
		
		
		System.out.println(a1);
		
		a1.add(3, "Ram");
		System.out.println(a1);
		
		Object obj1 = a1.remove(4);
		System.out.println(obj1);
		
		System.out.println("The elements from array list");
		Iterator it = a1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
