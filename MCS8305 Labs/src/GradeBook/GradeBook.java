package GradeBook;

public class GradeBook {
	
	private String course1, course2, course3;
	

	public GradeBook() {
		
		course1 = "Calculus";
		course2 = "C Programming";
		course3 = "Business Ethics";
		
	}
	
	public String getCourseName1() {
		
		return course1;
	}
	
	public String getCourseName2() {
		
		return course2;
	}
	
	public String getCourseName3() {
		
		return course3;
	}
	
	public void displayMessage() {
		
		System.out.println("Welcome to Java Programming");
	}

}
