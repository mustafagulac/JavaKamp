package ikinciGunOdev;

public class Course {

	public Course(int id, String courseName, String instructor, int courseProgress) {
		
		this.id = id;
		this.courseName = courseName;
		this.instructor = instructor;
		this.courseProgress = courseProgress;
	}
	
	int courseProgress;
	int id;
	String courseName;
    String instructor;
	
}
