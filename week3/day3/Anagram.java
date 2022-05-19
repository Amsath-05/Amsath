package week3.day3;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
	
	String name1="Stops";
	String name2="Potss";
	int length1 = name1.length();
	int length2 = name2.length();
	if (length1 == length2) {
		System.out.println("It's an Anagram");
		
		
	}
	
	String lowerCase = name1.toLowerCase();
	System.out.println(lowerCase);

	String lowerCase1 = name2.toLowerCase();
	System.out.println(lowerCase);
	
	char[] charArray = lowerCase.toCharArray();
	System.out.println(charArray);
	
	char[] charArray1 = lowerCase1.toCharArray();
	System.out.println(charArray1);
	
	Arrays.sort(charArray);
	System.out.println(lowerCase);
	Arrays.sort(charArray1);
	System.out.println(lowerCase1);
	boolean equals = Arrays.equals(charArray, charArray1);
	if (equals == true) {
		System.out.println("It's an Anagram");
	}else {
			System.out.println("It's not an Anagram");
		}
		}
			
		
	
	
}

