package week6.day3;

public class TypeCasting {
public static void main(String[] args) {
	int num=10;
	char c=(char)num;
	System.out.println(num);
	
	String number="123";
	int parseInt = Integer.parseInt(number);
	System.out.println(parseInt);
	
	double val=2.00;
	System.out.println(val);
	
	int value=(int) val;
	System.out.println(value);
}
}
