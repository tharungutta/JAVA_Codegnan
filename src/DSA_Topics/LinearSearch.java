package DSA_Topics;

import java.util.Arrays;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
//		int arr[]= {10,20,30,40,50};
//		int target = 30;
//		int index = -1;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]== target) {
//				index = i;
//				break;
//			}
//		}
//		System.out.println(index!=-1 ? "fouund at :"+index:"not Found");
    	
    	
    	
//    	String names[]= {"Tharun", "bali", "deva", "Sena"};
//    	String target = "deva";
//    	int index = -1;
//    	boolean found = false;
//    	for(int i=0;i<names.length;i++) {
//    		if(names[i].equals(target)) {
//    			index = i;
//    			found = true;
//    			break;
//    		}
//    	}
//    	System.out.println(found ? "present":"absent");
//    	System.out.println(index!=-1 ? "fouund at :"+index:"not Found");
    	
//    	int arr[]= {1,2,3,4,5};
//    	int element = -1;
//    	for(int i=0;i<arr.length;i++) {
//    		if(arr[i]%2 == 0) {
//    			element = arr[i];
//    			break;
//    		}
//    	}
//    	System.out.println(element!=-1 ? "First Even :"+element:"not Found");
    	
    	
    	List<String> list = Arrays.asList("pen","paper","pencil","book");
    	String target = "book";
        for(int i=0;i<list.size();i++) {
        	if(list.get(i).equals(target)) {
        		System.out.println("Found index :"+i);
        		return;
        	}
        }
        System.out.println("Not found .........");
	}
}
