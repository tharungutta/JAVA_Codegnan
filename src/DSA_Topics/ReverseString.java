package DSA_Topics;

public class ReverseString {
	public static String reverseString(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello")); 
    }
}



//package DSA_Topics;
//
//public class ReverseString {
//    public static String reverseString(String s) {
//        return new StringBuilder(s).reverse().toString();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(reverseString("hello"));  
//    }
//}