package week3.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		
		System.out.println(Arrays.toString(data));
		
		for (int i=4;i<data.length;i++) {
			
			System.out.println(data[i]);
			
		}
			
			
		
	}

}
