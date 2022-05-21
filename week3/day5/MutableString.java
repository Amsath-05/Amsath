package week3.day5;

public class MutableString {
	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("Amsath");
		System.out.println(buffer);
		buffer.append("Khan");
		System.out.println(buffer);
		
		StringBuffer rev=new StringBuffer("Testleaf");
	    StringBuffer reverse = rev.reverse();
		System.out.println(rev);
	}

	
}
