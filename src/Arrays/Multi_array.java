package Arrays;

public class Multi_array {
   public static void main(String[] args) {
	   int [][] arr = {{1,2,3},{3,4,5},{5,6,7}};
	   System.out.println("the given values are :");
	   for(int i=0;i<arr.length;i++) {
		   for( int j =0;j<arr.length;j++) {
			   System.out.println(arr[i][j]);
		   }
	   }
}
   
}
