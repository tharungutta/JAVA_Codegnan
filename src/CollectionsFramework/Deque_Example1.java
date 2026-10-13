package CollectionsFramework;
//A hospital maintains a queue of patients waiting for consultion.
// Normal patients joins from the rear of the queue
//

import java.util.*;

public class Deque_Example1 {
  public static void main(String[] args) {
	Deque<String> patients = new ArrayDeque<>();
	
	//add normal patients
	patients.addLast("Tharun");
	patients.addLast("Ramu");
	patients.addLast("Boob");
	
	System.out.println("Normal patients:"+patients);
	
	//add Emergency patient
	patients.addFirst("Karim");
	
	// add another normal patient
	patients.addLast("Teja");
	
	// display the patient queue
	System.out.println("Patients Queue:"+patients);
	
	// view the next patient
	System.out.println("Next patient:"+patients.peekFirst());
	
	//serve patient
	System.out.println("Patient served:"+patients.pollFirst());
	
	//cancel the appointment for the last patient in the queue
	System.out.println("The appointment is canceled for :"+patients.pollLast());
}
}
