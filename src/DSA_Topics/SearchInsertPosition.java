package DSA_Topics;

public class SearchInsertPosition {
   public static int searchInsert(int []arr, int target) {
	   int left = 0;
	   int right = arr.length-1;
	   int ans = -1;
	   while(left<= right) {
		   // find mid 
		   int mid = (left+right)/2;
		   if(arr[mid]>= target) {
			   ans = mid;
			   right = mid-1;
		   }else {
			   left = mid+1;
		   }
	   }
	   return ans;
   }
   public static void main(String[] args) {
	int arr[]= {1,3,5,6};
	// int target = 3;  // if target is already there it will return the index position  //1
	// int target = 2;    // if the target is not there , it will insert and return the positiin //1
	  int target =4;     // 2
	int result = searchInsert(arr, target);
	System.out.println("Insert Position :"+result);
}
}
