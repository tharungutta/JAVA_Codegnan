package Arrays;
// WAJA sort the values of an array in ascending order
public class Eaxmple_3 {
    public static void main(String[] args) {
		int []arr = {1,3,4,2,5};
		for(int i=0;i<arr.length;i++) {
			for(int j = 0;j<i;j++) {
				if(arr[i]<arr[j]) {
				int	temp  = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
