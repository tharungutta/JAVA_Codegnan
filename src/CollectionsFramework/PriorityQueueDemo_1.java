package CollectionsFramework;

import java.util.PriorityQueue;

public class PriorityQueueDemo_1 {
   public static void main(String[] args) {
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	
	// add elemnts using offer()
	
	pq.offer(40);
	pq.offer(20);                     // it does not maintain insertion order
	pq.offer(30);                       // it place the smallest element first while printing, but it will not sort the elements
	pq.offer(15);
	pq.offer(30);                      // duplicates are allowed
	pq.offer(25);
	
	System.out.println(pq);
	
	//peek()
	System.out.println(pq.peek());     // it will print the smallest element
	
	// poll()
	System.out.println(pq.poll());     // it will remove the smallest element, and print the removed element
	System.out.println(pq);
}
}
