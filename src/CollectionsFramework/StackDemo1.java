package CollectionsFramework;

import java.util.Stack;

public class StackDemo1 {
   public static void main(String[] args) {
	 Stack<Integer> stack = new Stack<>();
	 stack.push(10);
	 stack.push(30);
	 stack.push(20);
//	 stack.push("Aplle");   not allowed
	 stack.push(null);
	 stack.push(10);
	 System.out.println(stack);
	 
	 System.out.println("Before pop");
	 for(Integer e: stack) {
		 System.out.println(e);
	 }
	 
	
	 stack.pop();         //10 removed          // stack follows last in , first out principle so the when we use pop(), it will remove last element.	 
	 System.out.println("popped element:"+stack.pop());   // null removed
	 System.out.println("After pop");                
	 for(Integer e: stack) {
		 System.out.println(e);
	 }
	 
	 System.out.println("peeked element:"+stack.peek());    // returns the top element of the stack
}
}
