package week3.day2;

public class reverseString {
public static void main(String[] args) {
	String str="testleaf";
	//1
	boolean equals = str.equals("testleaf");
	System.out.println("Comparisoom with equals method's result:");
	
	//2
	boolean equalsIgnoreCase = str.equalsIgnoreCase(str);
	System.out.println("comparison with equalsIgnoreCase method's result:");
	
	//3
	int length =str.length();
	System.out.println(length);
	
	//4
	char[] charArray = str.toCharArray();
	for (int i = length-1; i >= 0; i--) {
	
	}
	//5
		String name="jeykee";
		char charAt = name.charAt(4);
		System.out.print(charAt);
		
}}
	


