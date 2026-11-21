package DSA_Topics;

public class Container {
   public static int maxAr(int heights[]) {
	   int left = 0;
	   int right = heights.length-1;
	   int maxArea = 0;
	   
	   while(left<right) {
		   int area = Math.min(heights[left], heights[right])*(right-left);
		   maxArea = Math.max(area, maxArea);
		   if(heights[left]<heights[right]) {
			   left++;
		   }
		   else {
			   right--;
		   }
	   }
	   return maxArea;
   }
   public static void main(String[] args) {
	int heights[] = {1,3,4,2,5,6,7,8};
	System.out.println(maxAr(heights));
}
}
