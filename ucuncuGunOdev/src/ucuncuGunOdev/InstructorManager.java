package ucuncuGunOdev;

public class InstructorManager extends UserManager {
	
	@Override
	public void add(User instructor) { 
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " egitmen olarak sisteme eklendi.");
	}
	
	@Override
	public void addMultiple(User[] instructors) {
		for (User instructor : instructors) {	
			add(instructor);
		}   
	}
	
	public void displayInstructorInformation(Instructor instructor) {
		System.out.println("---Egitmen Bilgisi---\n"
				          + "Adi: " + instructor.getFirstName() + "\n"
				          + "Soyadi: " + instructor.getLastName() + "\n"
				          + "Egitmen Numarasi: " + instructor.getInstructorNumber() + "\n"
				          + "Iletisim Numarasi: " + instructor.getContactNumber() + "\n"
				          + "Verdigi Kurslar: " + instructor.getGivenCourses());
					}

}
