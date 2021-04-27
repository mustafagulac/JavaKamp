package ikinciGunOdev;

public class CourseManager {
    
	 public void addToCourses(Course course) {
	       System.out.println(course.courseName + " kurslarýnýza eklendi.");    	
	    }
	 
	 public void progress(Course course) {
	       System.out.println(course.courseName + " kursu %" + course.courseProgress + " tamamlandý.");    	
	    }
	
	
}
