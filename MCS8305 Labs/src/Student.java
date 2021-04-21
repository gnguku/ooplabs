public class Student extends Person {

	public Student (String name, String gender, int dob, String regNo, String course)
	
	public void setRegNo(String regNo) {
		this.no = newregNo;
	}

	public void setCourse (String Course) {
		this.course = newCourse;
	}

	public String getRegNo() {
		return regNo;
	}

	public String getCourse() {
		return Course;
	}

	public String toString()
	{
		return "Student[super.toString() + firstName + lastName + Gender + Age + regNo + Course"]";
	}

}