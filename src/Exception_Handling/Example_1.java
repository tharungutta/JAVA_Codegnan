package Exception_Handling;
// can we throw static block from try block
public class Example_1 {

		static {
			int a = 10;
			int b = 20;
	
		try {
			int c = a/b;
			System.out.println("The value of c is :"+c);
			try {
				int []arr = {1,2,3,4,5};
				arr[10] = 100;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);                               
				e.printStackTrace();
			}
			finally {
				System.out.println("Inner finally block");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Outer finally block");
		}
		}

	}

// in static block we can create unchecked exception rising statements but not checked exceptions.