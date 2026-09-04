package Inheritance;

public class College extends Tharun {
      protected String colName;
      protected String colLoc;
      College(){
    	  colName = "SRM";
    	  colLoc = "Chennai";
    	  System.out.println("This is sub class constructor ");
      }
      College(String colName, String colLoc){
    	  super("Ramu",1000);
    	  this.colName = colName;
    	  this.colLoc = colLoc;
    	  System.out.println("This is sub class constructor ");
      }
      
      public static void main(String[] args) {
		College c1 = new College();
		c1.display();
		College c2 = new College("Sathyabama", "Chennai");
		c2.display();
	}
}
