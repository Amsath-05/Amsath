package week4.day1;

public class realme implements samsungDesign {

	
	public void faceAuthentication() {
		System.out.println("faceAuthentication");
		
	}

	
	public void fingerPrint() {
		System.out.println("fingerPrint");
		
	}
	public static void main(String[] args) {
		realme real=new realme();
		real.faceAuthentication();
		real.fingerPrint();
		
	}

}
