package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesSet {

	public static void main(String[] args) {

		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
		Arrays.sort(numbers);
		
		Set<Integer> NoDuplicates  = new LinkedHashSet<Integer>();
		
		for (int q=0;q<numbers.length;q++) {
			
			if (NoDuplicates.add(numbers[q])) {
				
				System.out.println(numbers[q]);
			}
		}

		
	}

}
