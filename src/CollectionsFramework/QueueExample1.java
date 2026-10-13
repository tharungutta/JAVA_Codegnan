package CollectionsFramework;
import java.util.*;
// Bank Customer Service :
//----------------------------
// Write a java program using linkedList methods:

// offer() - add the customer to the queue
// poll() - removes the customer from the queue
// peek()- lookup for the first customer standing in the queue

//1. add the customer to the queue using offer()
// 2. display all the customers
// 3. Display the next customer to served in the queue . -peek()
//4 . Serve the customer using pool() 
//5. Display the number of customers by using size()
//6. check whether the customers are waiting in queue or not by using isEmpty()

  public class QueueExample1 {
   public static void main(String[] args) {
	   // create a queue using linkedList
	Queue<String> cust = new LinkedList<>();
	
	//1. add the customers
	  cust.offer("Tharun");
	  cust.offer("Ramu");
	  cust.offer("Boob");
	  cust.offer("Karim");
	  
	 // 2. display the customers
	  System.out.println("Waiting customers:"+cust);
	  
	//3. customer to be served
	  System.out.println("Next cutomer:"+cust.peek());
	  
	 //4. serve the customer
	  System.out.println("customer serving:"+cust.poll());
	  
	 //5. number of customers waiting 
	  System.out.println("No of remaining customers:"+cust.size());
	  
	  //6. customers are there or not
	  System.out.println("Is customer queue is empty ..? :"+cust.isEmpty());
	  
	  //7. display the next customer
	  System.out.println("Next Customer:"+cust.peek());
}
}
