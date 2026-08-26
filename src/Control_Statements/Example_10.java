//5 4 3 2 1 
//1 2 3 4 
//3 2 1 
//1 2 
//1 

package Control_Statements;
public class Example_10 {
   public static void main(String[] args) {
      int n = 5;
      for(int i=n;i>=1;i--) {
    	  if(i%2==0) {
    		  for(int j=1;j<=i;j++) {
    			  System.out.print(j +" ");
    		  }
    	  }
    	  else {
    		  for(int j=i;j>=1;j-- ) {
    			  System.out.print(j +" ");
    		  }
    	  }
    	  System.out.println("");
      }
	 
}
}
