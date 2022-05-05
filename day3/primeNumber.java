package week1.day3;

public class primeNumber {
public static void main(String[] args){
	int c=13;
	int count=0;
	for (int i = 1; i <=c; i++) {
		if(c%i==0) {
			count++;
		}
	}
	if(count==2 ) {
		System.out.println("given number is prime number");
		
	}
	else {
		System.out.println("given number is not prime number");
	}
}	
}
