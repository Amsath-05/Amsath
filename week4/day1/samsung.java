package week4.day1;

public class samsung implements AndroidDesign {

	
	public void startPhone() {
		System.out.println("startphone");
		
	}

	
	public void makeCall() {
		System.out.println("makeCall");
		
	}

	public void sendSms() {
		System.out.println("sendSms");
		
	}
	public void samsungNote() {
		System.out.println("samsungNote");
	}
	public static void main(String[] args) {
		samsung obj=new samsung();
		obj.startPhone();
		obj.makeCall();
		obj.sendSms();
		obj.samsungNote();
		
	}
}

