package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<String> val=new ArrayList<String>();
	//allows duplicate
	//maintain insertion order
	val.add("jeykee");
	val.add("mughil");
	val.add("madhuBhaishab");
	val.add("dinesh");
	System.out.println(val);
	
	val.add(0, "amsath");
	System.out.println(val);
	
	int size=val.size();
	System.out.println(size);
	
	boolean contains=val.contains("jeykee");
	System.out.println(contains);
	
	String remove=val.remove(2);
	System.out.println(remove);
	
	String String=val.get(3);
	System.out.println(String);
	
	val.removeAll(val);
	System.out.println(val);
	
	boolean empty=val.isEmpty();
	System.out.println(empty);
	
	
	}
}
