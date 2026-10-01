package Practice_Exception;
import java.util.*;
public class RestaruntClosingException extends Exception {
   public RestaruntClosingException(String msg) {
	   super(msg);
   }
}
 class ItemNotAvailableException extends Exception {
	   public ItemNotAvailableException(String msg) {
		   super(msg);
	   }
	}
  class MinimumOrderException extends Exception {
	   public MinimumOrderException(String msg) {
		   super(msg);
	   }
	}
 class AddressInvalidException extends Exception {
	   public AddressInvalidException(String msg) {
		   super(msg);
	   }
	}
 class PaymentErrorException extends Exception {
	   public PaymentErrorException(String msg) {
		   super(msg);
	   }
	}
 
 class Food{
	 public void restaruntAvailable(boolean b1) throws RestaruntClosingException {
		 if(b1) {
			 System.out.println("Restaurnt open , choose items");
		 }else {
				 throw new RestaruntClosingException("Restarunt closed, sorry ");		 
		 }	 
	 }
	 public void itemAvailable(boolean b2) throws ItemNotAvailableException {
		 if(b2) {
			 System.out.println("Item is avilable , Minimum order is 200");
		 }else {
				 throw new ItemNotAvailableException("Item is not available, sorry ");		 
		 }	 
	 }
	 public void minOrder(int num) throws  MinimumOrderException {
		 int minOrder = 200;
		 if(num>minOrder) {
			 System.out.println("min order is passed , give address");
		 }else {
				 throw new MinimumOrderException("order should above min order, sorry ");		 
		 }	 
	 }
	 public void address(String add) throws  AddressInvalidException {
		 if(add == null || add.length()<=10) {
			 throw new AddressInvalidException("Address is invalid, sorry ");	
		 }else {
				
				 System.out.println("Address is valid , make payment");
		 }	 
	 }
	 public void payment(boolean b3) throws  PaymentErrorException {
		 if(b3) {
			 System.out.println("payment successfull , order placed");
		 }else {
				 throw new PaymentErrorException("payment inavlid, sorry ");		 
		 }	 
	 }
	 public void palceOrder(boolean b1, boolean b2, int num, String add, boolean b3) throws AddressInvalidException,ItemNotAvailableException,MinimumOrderException,PaymentErrorException,RestaruntClosingException{
		 restaruntAvailable( b1);
		 itemAvailable(b2);
		 minOrder(num);
		 address(add);
		 payment(b3);
		 System.out.println("Order successfull");
	 }
 }
 
 class FoodDemo{
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter restarunt open or not:");
		 boolean b1 = sc.nextBoolean();
		 System.out.println("Enter items availablie or not:");
		 boolean b2 = sc.nextBoolean();
		 System.out.println("Enter the order value:");
		 int num = sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the address: ");
		 String address = sc.nextLine();
		 System.out.println("Payment is successfull or not:");
		 boolean b3 = sc.nextBoolean();
		 
		Food f1 = new Food();
	    
		try {
			f1.palceOrder(b1, b2,num, address, b3);
		}catch(RestaruntClosingException e) {
			System.out.println("Restarnt closing :"+e.getMessage());
		}catch(PaymentErrorException e) {
			System.out.println("Payment error :"+e.getMessage());
		}catch(ItemNotAvailableException e) {
			System.out.println("Item not availble :"+e.getMessage());
		}catch(AddressInvalidException e) {
			System.out.println("address invlid :"+e.getMessage());
		}catch(MinimumOrderException e) {
			System.out.println("minimum order :"+e.getMessage());
		}
	}
 }
 