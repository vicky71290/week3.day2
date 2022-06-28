package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSetDuplicateRemoval {

	public static void main(String[] args) {
		
		String Name = "DheeranAryaDev";
		char[] NameArray = Name.toCharArray();
		System.out.println(NameArray);
		int length = NameArray.length;
		Set<Character> NameSet = new LinkedHashSet<Character>();

		
		for (int q=0;q<length;q++) {
			
			if (NameSet.add(NameArray[q])) {
				
				System.out.print(NameArray[q]);

			}
			
		}
		

	}

}
