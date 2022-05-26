package week4.day3;

import java.util.HashSet;
import java.util.Set;

public class printOnlyUniqueCharacter {
	public static void main(String[] args) {
		String in = "babub";
		char[] charArray = in.toCharArray();
		Set<Character> str= new HashSet<Character>();
		str.add('b');
		str.add('a');
		str.add('b');
		str.add('u');
		str.add('b');
		
		str.remove('b');
		System.out.println(str);

	}}
