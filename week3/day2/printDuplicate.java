package week3.day2;

public class printDuplicate {
public static void main(String[] args) {
	int arr[]= {2,3,5,4,7,2,3,6,99,1};
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]== arr[j]) {
				System.out.println(arr[i]);
		}}
	}
}
}
