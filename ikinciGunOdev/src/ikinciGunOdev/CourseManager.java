package ikinciGunOdev;

public class CourseManager {
    
	 public void addToCourses(Course course) {
	       System.out.println(course.courseName + " kurslar�n�za eklendi.");    	
	    }
	 
	 public void progress(Course course) {
	       System.out.println(course.courseName + " kursu %" + course.courseProgress + " tamamland�.");    	
	    }
	
	
}