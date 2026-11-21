package DSA_Topics;

public class Palindrome {
  public static void checkPalindrome(String s) {
	  int left = 0;
	  int right = s.length()-1;
	  while(left<right) {
		  if(s.charAt(left)!= s.charAt(right)) {
			  System.out.println("Not palindrome");
			  return;
		  }
		  left++;
		  right--;
	  }
	  System.out.println("Palidrome");
  }
  public static void main(String[] args) {
	String s = "level";
	checkPalindrome(s);
}
}
