package week4.day4;

public class palindrome {
	public static void main(String[] args) {
		String name="madame";
		String reverse="";
				for (int i = name.length()-1; i >=0 ; i--) {
					reverse=reverse+name.charAt(i);
					
					
				}
				System.out.println(reverse);
				if (name.equalsIgnoreCase(reverse)) {
					System.out.println("palindrome");
					
				}
				else {
					System.out.println("not a palindrome");
				}
	}

}
