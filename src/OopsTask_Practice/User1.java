package OopsTask_Practice;
import java.util.*;
public class User1 {
  private String userName;
  private String password;
  public void setuserName(String userName) {
	  this.userName = userName;
  }
  public String getuserName() {
	  return userName;
  }
  public void setpassword(String password) {
	  this.password = password;
  }
//  public String getpassword() {
//	  return password;
//  }
   public void login(String userName, String password) {
	   if((this.userName.equals(userName)) && (this.password.equals(password))) {
		   System.out.println("Login successfull");
	   }else {
		   System.out.println("Invalid credentilas");
	   }
   }
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	User1 u1 = new User1();
	u1.setuserName("Tharun");
	u1.setpassword("Tharun@123");
	System.out.println("Enter the userName:");
	String userName = sc.nextLine();
	System.out.println("Enter the password:");
	String pass = sc.nextLine();
	u1.login(userName, pass);
	
}
}
