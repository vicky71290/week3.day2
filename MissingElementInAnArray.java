
package week3.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,7,6,8};
		int q = 1;
		Arrays.sort(numbers);
		
		for (int w=0;w<numbers.length;w++) {
			
			System.out.println(numbers[w]);

		}
		
		
		for (int i=0;i<numbers.length;i++) {
			
			if (numbers[i] == q) {
				q++;
			}
			
			else {
				
				System.out.println("Missing Number is " + (numbers[i]-1));
				break;
				
			}
		}
		
	}

}
