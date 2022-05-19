package week3.day1;

import java.util.Arrays;

public class secondLargestvalue {
	public static void main(String[] args) {
		int arr[]= {2,99,45,22,3333,453,12,77,88,123};
		Arrays.sort(arr);
		int len=arr.length;
		System.out.println(arr[len-2]);
		
	}

}
