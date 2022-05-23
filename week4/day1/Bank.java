package week4.day1;

public class Bank implements CIBIL,PNB {
 


public void minimumLoanAmount() {
	System.out.println("minimumLoanAmount");
	
}

public void creditScore() {
    System.out.println("creditScore");
	
}

public void minimumBalance() {
	System.out.println("minimumBalance");
	
}

public void cibilScore() {
	System.out.println("cibilScore");
	
}
public static void main(String[] args) {
	CIBIL obj=new Bank();
	obj.cibilScore();
	
	PNB obj1=new Bank();
	obj1.creditScore();
	obj1.minimumBalance();
	obj1.minimumLoanAmount();
	}
}
