package OopsTask_Practice;

public class Notification {
  public void sendNotification() {
	  System.out.println("Parent class notification");
  }
}
class EmailNotification extends Notification{
	@Override
	public void sendNotification() {
		System.out.println("Email notification");
	}
}
class SMSNotification extends Notification{
	@Override
	public void sendNotification(){
		System.out.println("SMS Notification");
	}
}
class WhatsappNotification extends Notification{
	@Override
	public void sendNotification() {
		System.out.println("Whatsapp notification");
	}
	public static void main(String[] args) {
		Notification n1 = new EmailNotification();
		n1.sendNotification();
		Notification n2 = new SMSNotification();
        n2.sendNotification();
        Notification n3 = new WhatsappNotification();
        n3.sendNotification();
	}
}
