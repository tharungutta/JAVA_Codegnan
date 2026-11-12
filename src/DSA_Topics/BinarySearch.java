package DSA_Topics;
import java.util.*;
public class BinarySearch {
   public static void main(String[] args) {
//	int arr[]= {34, 55, 32, 66, 78, 60};
//	int target = 66;
//    Arrays.sort(arr);
//    System.out.println(Arrays.toString(arr));
//    int low = 0, high = arr.length-1;
//     while(low<=high) {
//    	 // find the mid
//    	 int mid = (low+high)/2;
//    	 if(arr[mid]== target) {
//    		 System.out.println("Found ele:"+mid);
//    		 return;
//    	 }else if( target < arr[mid]) {
//    		 high = mid -1;
//    	 }else {
//    		 low = mid +1;
//    	 }
//     }
//     System.out.println("Not found.... ");
	   
	   
	   String names[]= {"Tharun", "bahu","bali","evil","dead"};
	   String target = "evil";
	   
	   int low = 0;
	   int high = names.length-1;
	   
	   while(low<=high) {
		   int mid= (low+high)/2;
		   int cmp = names[mid].compareTo(target);
		   if(cmp ==0) {
			   System.out.println("Found ele:"+mid);
			   return;
		   }else if(cmp>0) {
			   high = mid-1;
		   }else {
			   low = mid+1;
		   }
	   }
	   System.out.println("Not found.............");
	   
}
}
