package DSA_Topics;

public class CountOccurences {
	public static int firstOccurence(int arr[],int target) {
		   int left = 0,  right = arr.length-1;
		   int ans = -1; // dont know the index
		   
		   while(left<= right) {
			   // find the mid element
			   int mid = (left+right)/2;
			   if(arr[mid]== target) {
				   ans = mid;   // updating index pos
				  right = mid -1;// going left    // for 1st occurrence
				 //  left = mid+1;   // going right     // for last occurrence
			   }else if(arr[mid]<target) {
				   left = mid+1;
			   }else {
				   right = mid-1;
			   }
		   }
		    return ans;
		  }
	
	public static int lastOccuence(int arr[],int target) {
		   int left = 0,  right = arr.length-1;
		   int ans = -1; // dont know the index
		   
		   while(left<= right) {
			   // find the mid element
			   int mid = (left+right)/2;
			   if(arr[mid]== target) {
				   ans = mid;   // updating index pos
				//   right = mid -1;// going left    // for 1st occurrence
				   left = mid+1;   // going right     // for last occurrence
			   }else if(arr[mid]<target) {
				   left = mid+1;
			   }else {
				   right = mid-1;
			   }
		   }
		    return ans;
		  }
	public static int countOccuernce(int arr[], int target) {
		int first = firstOccurence(arr, target);
		if(first == -1) {
			return 0;
		}
		int last = lastOccuence(arr, target);
		int result = last-first+1;
		return result;
	}
	public static void main(String[] args) {
		int []arr = {1,2,2,2,2,2,2,3,4,5};
		int target = 2;
		int res1 = countOccuernce(arr, target);
		System.out.println(res1);
	}
	
}
