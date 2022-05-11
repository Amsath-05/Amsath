package week1.day3;

public class primeNumberBoolean {
	public static void main(String[] args) {
		int a=19;
	boolean flag=false;
	for (int i = 1; i <=a -1; i++) {
		if(a%i==0) {
			flag=true;
			System.out.println("not prime");
		}
	}
	if(!flag) {
		System.out.println("given number is prime");
	}else {
		System.out.println("given number is prime");
	}
	}

}
