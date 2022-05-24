package week4.day1;

public class Bank extends SBI implements CIBIL,PNB {
 


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
public void bankBalance() {
	System.out.println("bankBalance");
	
}
public void maximamLoanAmount() {
	System.out.println("maximamLoanAmount");
	
}
public static void main(String[] args) {
	CIBIL obj=new Bank();
	obj.cibilScore();
	
	PNB obj1=new Bank();
	obj1.creditScore();
	obj1.minimumBalance();
	obj1.minimumLoanAmount();
	
	Bank obj2=new Bank();
	obj2.ITLoan();
	obj2.bankBalance();
	obj2.maximamLoanAmount();
	}


}
