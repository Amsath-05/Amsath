package week6.day2;
//encapsulation concept
public class UseCard {

	 public static void main(String[] args) {
		PersonalPayment payment=new PersonalPayment();
		payment.setCretidcardnumber("5655 5555 5555 5555");
		System.out.println(payment.getCretidcardnumber());
	}
}
