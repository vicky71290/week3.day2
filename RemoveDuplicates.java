package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";		

		// Splitting String into Array - Split is an array

		char[] textArray = text.toCharArray();
		int length = textArray.length;
		Set <Character> RemoveDup = new LinkedHashSet<Character>();

		for (int i = 0;i<length;i++)  {

			if (RemoveDup.add(textArray[i])) {
			System.out.print(textArray[i]);

		}
		
	}

	}
	
}
