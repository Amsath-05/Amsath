package week3.day4;

public class oddIndextoUppercase {
	public static void main(String[] args) {
		String name="welcome";
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i%2!=0) {
				charArray[i]=Character.toUpperCase(charArray[i]);
			}
			System.out.print(charArray[i]);
		}
	}

}
