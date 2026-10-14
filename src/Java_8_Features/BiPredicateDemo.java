package Java_8_Features;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
   public static void main(String[] args) {
	BiPredicate<Integer, Integer> checksum = (n1,n2) -> (n1+n2)>100;
	System.out.println(checksum.test(40, 40));
	
	BiPredicate<Integer, Integer> isEligible = (age, per)-> (age>=18 && per>=60);
	System.out.println(isEligible.test(18, 65));
}
}
