package week3.day2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {

		String Trainer = "babu";
		
		char[] TrainerArray = Trainer.toCharArray();
		int length = TrainerArray.length;
		
		Set<Character> UniqueChar = new LinkedHashSet<Character>();
		
		for(int q=0;q<length;q++) {
			
			if (UniqueChar.add(TrainerArray[q])) {
				
				System.out.println(TrainerArray[q]);
			}
		}
		
	}

}
