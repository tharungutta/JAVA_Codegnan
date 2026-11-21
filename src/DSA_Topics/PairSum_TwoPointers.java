package DSA_Topics;

import java.util.Arrays;

public class PairSum_TwoPointers {
 
	public static void pairSum(int arr[] , int target) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int sum = arr[left]+arr[right];
			if(sum == target) {
				System.out.println("Pairs are:"+arr[left]+" "+arr[right]);
				left++;
				right--;
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,1,4,3,5,7,6,8};
		int target = 10;
		  pairSum(arr, target);
	}

}
