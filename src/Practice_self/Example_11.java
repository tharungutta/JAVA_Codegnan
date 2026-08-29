package Practice_self;
// print the duplicates
public class Example_11 {
  public static void main(String[] args) {
	  int [] a = {4,5,4,2,4,2,1,3,4,3};  
	  for(int i=0;i<a.length;i++) {
		  int count = 1;
		  for(int j=i+1;j<a.length;j++) {
			  if(a[i] == a[j]) {
				  count++;
				  a[j] = Integer.MAX_VALUE;
			  }
		  }
		  if(a[i]!= Integer.MAX_VALUE && count>1) {
			  System.out.print(a[i]+ " ");
		  }
	  }
}
}
