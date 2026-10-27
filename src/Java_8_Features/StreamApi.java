package Java_8_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
 public static void main(String[] args) {
	  List<Integer> al = Arrays.asList(10,20,30,4,5,7,98);
	    System.out.println(al);
	    
	    //Even numbers
	    List<Integer> evenNum = al.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
	    System.out.println("Even num :"+evenNum);
	    		
	    // update the marks
	    List<Integer> updateMarks = al.stream().map(i -> i+5).collect(Collectors.toList());
	    System.out.println("Upadted marks:"+updateMarks);
	    		
	   // failed students
	   long failStu =  	al.stream().filter(i -> i<35).count();
	   System.out.println("Failed Stu:"+failStu);
	   
	   // distinct data
	   al.stream().distinct().forEach(System.out::println);
	   
	   // print only first 3 marks
	   List<Integer> firstThree = al.stream().limit(3).collect(Collectors.toList());
	   System.out.println("First Three:"+firstThree);
	   
	   // Skip first three
	   List<Integer> afterThree = al.stream().skip(3).collect(Collectors.toList());
	   System.out.println("After threee:"+afterThree);
	   
	   // sorted order
	   List<Integer>  sortedData = al.stream().sorted().collect(Collectors.toList());
	   System.out.println("Normal sort :"+sortedData);
	   
	   List<Integer> customSort = al.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
	   System.out.println("Custom Sort:"+customSort);
	   
	   List<Integer> compasort = al.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	   System.out.println(compasort);
	           // minimum marks
	   int minVal = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
	           System.out.println("min marks :" + minVal);
	   int maxVal = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
	           System.out.println("min marks :" + maxVal);
	           // by using method referenece
	           al.stream().forEach(System.out::println);
	   
}
    
}
