package ucuncuGunOdev;

public class Instructor extends User {

	private String givenCourses;
	private int instructorNumber;
	private String abilities;
	
	
	public String getGivenCourses() {
		return givenCourses;
	}
	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}
	public int getInstructorNumber() {
		return instructorNumber;
	}
	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
	public String getAbilities() {
		return abilities;
	}
	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}
	
}
