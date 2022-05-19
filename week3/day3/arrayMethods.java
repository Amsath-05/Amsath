package week3.day3;


public class arrayMethods {
	public static void main(String[] args) {
		
	
	String name ="AmsathKhan@!#533";
	String name1="jey kee";
	String name2="gov bus is always crowdy";
	//touppercase
	String upperCase = name.toUpperCase();
	System.out.println(upperCase);
	
	//lowercase
	String lowerCase = name.toLowerCase();
	System.out.println(lowerCase);
	
	//concat
	String concat = name.concat(" ").concat(name1);
	System.out.println(concat);
	
	//replace
	String replace = name1.replace('e', 'a');
	System.out.println(replace);
	
	//replaceall
	String replaceAll = name.replaceAll("\\D", "");
	System.out.println(replaceAll);
	
	String replaceAll2 = name.replaceAll("\\d","" );
	System.out.println(replaceAll2);
	
	String replaceAll3 = name.replaceAll("\\w", "");
	System.out.println(replaceAll3);
	
	String replaceAll4 = name.replaceAll("\s+","");
	System.out.println(replaceAll4);
	
	
	//substring
	String substring = name.substring(4);
	System.out.println(substring);
	
	
	//split
	String[] split = name2.split(" ");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	
	
	
	}
}
