package week4.day3;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Fixed deposit");
	}
public static void main(String[] args) {
	AxisBank bank=new AxisBank();
	bank.deposit();
	bank.fixed();
	bank.saving();
}
}
