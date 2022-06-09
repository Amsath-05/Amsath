package week6.day3;

public class LearnThrows {
	public int divide(int x,int y) throws InterruptedException {
		int z=0;
		if (x<y) {
			Thread.sleep(3000);		
			z=x/y;
			throw new ArithmeticException();
		}
		return z;
	}
	
public static void main(String[] args) throws InterruptedException {
	LearnThrows learn=new LearnThrows();
	System.out.println(learn.divide(2, 10));
	
}
}
