public class Person {
	
	private String name;
	private String gender;
	private int dob;


    public Person (String name) {

        this.name = name;

    }

	public Person (String name, String gender, int dob) {

	this.name = name;
	this.gender = gender;
	this.dob = dob;

}
	public void setGender(String newGender) {
		this.gender = newGender;
	}

	public void setDob (int newDob) {
		this.dob = newDob;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public void printDetails () {
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.age);
	}
	
}