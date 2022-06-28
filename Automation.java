package week3.day2;

public class Automation extends MultipleLanguage implements Language, TestTool {
	
	//MultipleLanguage is abstract class which has unimplemented methods ruby()
	//Language and Test Tool are Interfacesd which can only have unimplemented methods
	// Automation is a concrte class which extends Abstract class and implements interfaces
	// while we do that, all unimplemented methods of Abstract class and interfaces should be implmeneted in concrete class.

	public static void main(String[] args) {	
		
		Automation Abstraction = new Automation();
		Abstraction.Selenium();
		Abstraction.Java();
		Abstraction.Python();
		Abstraction.ruby();

	}

	public void Selenium() {

		System.out.println("Selenium is a method under Test Tool Interface");
		
	}

	@Override
	public void ruby() {
		
		System.out.println("Ruby is an unimplemented method under MultipleLanguage Abstract Class");

		
	}

	public void Java() {

		System.out.println("JAVA is an unimplemented method under Language Interface ");

		
	}
	
	

}
