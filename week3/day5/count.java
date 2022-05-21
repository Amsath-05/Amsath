package week3.day5;

public class count {
public static void main(String[] args) {
	String name="Testleaf";
	int count=0;
	char[] charArray = name.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		if (charArray[i]=='e') {
			
			count++;
			
			
		}
	}System.out.println(count);
}
}
