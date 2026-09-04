package Inheritance;

public class Google {
   protected int gId;
   protected String gLoc;
   
   Google(){
	   gId = 123;
	   gLoc = "Hyd";
	   System.out.println("This is from grand parent (google) non parametreized constructor" );
   }
   Google(int gId, String gLoc){
	   this.gId = gId;
	   this.gLoc = gLoc;
	   System.out.println("This is from grand parent (google) parametreized constructor" );
   }
   void display() {
	   System.out.println("google id: "+gId);
	   System.out.println("google Location: "+gLoc);
   }
}
