package week1.day4;

public class armstrongNumber1 {
		public static void main(String[] args) {
			int input=153;
			int orgNum=input;
			int sum=0,r;
			while(input>0) {
				r=input%10;
				sum=sum+(r*r*r);
				input=input/10;
		 }
			if(sum==orgNum) {
				System.out.println("armstrong number");
		}
			else {
				System.out.println("not an armstrong number");
			}
	}}


