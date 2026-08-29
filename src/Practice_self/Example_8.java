package Practice_self;
// Linear search
public class Example_8 {
	public static int linearSearch(int []arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]== key) {
				return i;		
			}
		}
		return -1;
	}
   public static void main(String[] args) {
	int [] arr = {10,30,50,70,20,40,60};
	int key = 50;
	int num = linearSearch(arr,key);

	if(num == -1) {
		System.out.println("Data is not present");
	}else{
		System.out.println("Data is present");
	}
}
}
