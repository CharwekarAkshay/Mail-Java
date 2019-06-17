package mail;

public class App {
	public static void main(String[] args) {
		MailSender.send("Your email address", "Your password", "Reciver Address", "Subject", "Message");
	}
}
