package week6.day3;

public class LearnException {
public static void main(String[] args) throws InterruptedException {
	int x=10;
	int y=0;
	Thread.sleep(2000);
	
	int z;
	try {
		z=x/y;
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Catch Block");
	}
	System.out.println("Execution Completed");
}
}
