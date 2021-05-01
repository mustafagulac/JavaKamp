package ucuncuGunOdev;


public class StudentManager extends UserManager{
	
	@Override
	public void add(User student) { 
		System.out.println(student.getFirstName() + " " + student.getLastName() + " ogrenci olarak sisteme eklendi.");
	}
	
	@Override
	public void addMultiple(User[] students) {
		for (User student : students) {	
			add(student);
		}   
	}
	
	
	public void displayStudentInformation(Student student) {
		
		System.out.println("---Ogrenci Bilgisi---\n"
				          + "Adi: " + student.getFirstName() + "\n"
				          + "Soyadi: " + student.getLastName() + "\n"
				          + "Ogrenci Numarasi: " + student.getStudentNumber() + "\n"
				          + "Iletisim Numarasi: " + student.getContactNumber() + "\n"
				          + "Aldigi Kurslar: " + student.getCourseName() );
					}
	

	
}
