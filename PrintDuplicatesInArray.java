package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {
	
	public void printDuplicates() {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		for (int i=0;i<arr.length-1;i++) {
			
			for (int r = i+1;r<arr.length;r++) {
				
				if (arr[i] == arr [r]) {
					
					System.out.println( "Duplicate Numbers in this array are " + arr[r]);
					
				}
				
			}
			
		}
		
	}
	
	public void printDuplicatesSet() {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set<Integer> SetArr = new HashSet<Integer>();
		
		Arrays.sort(arr);
		
		for (int i=0;i<arr.length;i++) {
			
			SetArr.add(arr[i]);
		}
		
		System.out.println(SetArr);
	}

	public static void main(String[] args) {
		
		PrintDuplicatesInArray Object = new PrintDuplicatesInArray();
		Object.printDuplicates();
		Object.printDuplicatesSet();

	}

}
