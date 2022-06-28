package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

//		HashSet follows random order
		
		Set<String> EmployeeName = new HashSet<String>();
		EmployeeName.add("Vignesh");
		EmployeeName.add("Dheeran");
		EmployeeName.add("AryaDev");
		System.out.println(EmployeeName);
		
//		LinkedHashSet follows FIFO
		
		Set<String> EmployeeName1 = new LinkedHashSet<String>();
		EmployeeName1.add("Vignesh");
		EmployeeName1.add("Dheeran");
		EmployeeName1.add("AryaDev");
		System.out.println(EmployeeName1);
		
//		TreeSet follows Alphabetical Order
		
		Set<String> EmployeeName2 = new TreeSet<String>();
		EmployeeName2.add("Vignesh");
		EmployeeName2.add("Dheeran");
		EmployeeName2.add("AryaDev");
		System.out.println(EmployeeName2);
		
		
	}

}
