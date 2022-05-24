package week4.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	Set<String> name=new LinkedHashSet<String>();
	name.add("jeekee");
	name.add("mughil");
	name.add("Madhu");
	name.add("dinesh");
	System.out.println(name);
			
}
}


      // treeset-->ascii value output-->[Madhu, dinesh, jeekee, mughil]
	  // HashSet-->hashing algorithm-->random output-->[jeekee, Madhu, mughil, dinesh]
	  // LinkedHashSet-->insertion order output-->[jeekee, mughil, Madhu, dinesh]