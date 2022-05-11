package week1.day4;

public class sumOfDigits {
	public static void main(String[] args) {
		int input=654;
		int sum=0;
		int r;
		while(input>0) {
	        r=input%10;
			sum=sum+r;
			input=input/10;
	 }
		System.out.println(sum);
	}

}
