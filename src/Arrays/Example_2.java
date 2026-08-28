package Arrays;
// WAJA to print second biggest number in an array
public class Example_2 {
public static void main(String[] args) {
	  int [] arr = {10,20,30,40,50};
	  int big = arr[0] ;
	  int sbig = arr[1];
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]>big) {
			  sbig = big;
			  big = arr[i];
		  }else if(arr[i]>sbig && arr[i]!=big) {
			 sbig = arr[i];
		  }
	  }
	  System.out.println(big);
	  System.out.println(sbig);

}
  
  
}
