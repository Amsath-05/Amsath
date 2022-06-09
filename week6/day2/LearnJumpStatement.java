package week6.day2;

public class LearnJumpStatement {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		if(i==3) {
			System.out.println("Three");
			continue;
		}
		System.out.println(i);
	}
}
}
