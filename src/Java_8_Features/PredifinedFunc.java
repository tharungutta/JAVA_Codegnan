package Java_8_Features;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredifinedFunc {
   public static void main(String[] args) {
	 Predicate<Integer>p =  i -> i%2==0;
	 System.out.println(p.test(23));
	 System.out.println(p.test(66));
	 System.out.println(p.test(24));
	 
	 String[] names = {"Tharun","Ramu","Boob","Syed Karim"};
	    Predicate<String>p1 =  s -> s.length()>6;
	    for(String str: names) {
	    	if(p1.test(str)) {
	    		System.out.println(str);
	    	}
	    }
	    
	    //Function : input, output type
	    Function<Integer, Integer> f= i-> i*i;
	    System.out.println(f.apply(2));
	    System.out.println(f.apply(12));
	    System.out.println(f.apply(22));
	    
	    Function<String, Integer> f1 = st -> st.length();
	    System.out.println(f1.apply("Keerthi"));
	    System.out.println(f1.apply("Suresh"));
	    System.out.println(f1.apply("Balllaaa"));
	    
	    Function<String, String >f2 = ss -> ss.toUpperCase();
	    System.out.println(f2.apply("jailer 2"));
	    System.out.println(f2.apply("ranabali"));
	    
	    // Consumer --> Print data
	    
	    Consumer<String> c = a-> System.out.println(a);
	    c.accept("sathya");
	    c.accept("Deva sena");
	    
	    // Supplier : will accept only objects
	    
	    Supplier<Date> date = ()-> new Date();
	    System.out.println(date.get());
	    
	    
	    
	     
	    Supplier<String> tt = ()-> {
	    	String otp = "";
	    	for(int i =0;i<6;i++) {
	    		otp = otp+(int)(Math.random()*10);
	    	}
	    	return otp;
	    };
	    System.out.println(tt.get());
}
}
