package week6.day2;

public class GreatestOfThreeNumbers {
public static void main(String[] args) {
	int a=10;
	int b=7;
	int c=12;
	if (a>b&&a>c) {
		System.out.println("a is Greater"+" "+a);
	}
	else if (b>c&&b>a) {
		System.out.println("b is Greater"+" "+b);
	}
	else {
		System.out.println("c is Greater"+" "+c);
	}
}
}
