package week3.day1;

import java.util.Arrays;


public class Arraysorting {
public static void main(String[] args) {
	int arr[]= {1,5,3,6,8,9,2,4,7,10};
	Arrays.sort(arr);
	int len=arr.length;
	for (int i =len-1; i >=0; i--) {
		System.out.print(arr[i]+",");
		
	}
	
}
}
