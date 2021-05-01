package ucuncuGunOdev;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Mustafa");
		user1.setLastName("Gulac");
		user1.setEmail("gulacmustafa1@gmail.com");
		user1.setPassword("123456789");
		user1.setContactNumber("05XX XXX XX XX");
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Engin");
		user2.setLastName("Demirog");
		user2.setEmail("engindemirog@gmail.com");
		user2.setPassword("987654321");
		user2.setContactNumber("05XX XXX XX XX");
		
		System.out.println("---------KULLANICI ISLEMLERI---------");
		UserManager userManager = new UserManager();
		User[] users = {user1,user2};
		userManager.addMultiple(users); // Çoklu ekleme 
		//userManager.add(user2); Tekli ekleme
		userManager.login(user1, "gulacmustafa1@gmail.com", "123456789"); //Dogru giris
		//userManager.login(user1, "gulacmustafa1@gmail.com", "16789"); Hatali kullanim
		userManager.logout(user1);
		System.out.println("-------------------------------------\n");
		
	
		
		Student student1 = new Student();
		student1.setId(3);
		student1.setStudentNumber(1001);
		student1.setFirstName("Ahmet");
		student1.setLastName("Kirmizi");
		student1.setEmail("ahmetkirmizi@gmail.com");
		student1.setPassword("456789");
		student1.setContactNumber("05XX XXX XX XX");
		student1.setCourseName("Yazilim Gelistirici Yetistirme Kampi (JAVA + REACT)");
	
		Student student2 = new Student();
		student2.setId(4);
		student2.setStudentNumber(1002);
		student2.setFirstName("Zeynep");
		student2.setLastName("Beyaz");
		student2.setEmail("zeynepbeyaz@gmail.com");
		student2.setPassword("987456");
		student2.setContactNumber("05XX XXX XX XX");
		student2.setCourseName("Yazýlým Gelistirici Yetistirme Kampi (C# + ANGULAR)");
		
		
		System.out.println("---------OGRENCI ISLEMLERI---------");
		StudentManager studentManager = new StudentManager();
		Student[] students = {student1,student2};
		studentManager.addMultiple(students); // Coklu ekleme
		//studentManager.add(student1); Tekil ekleme
		studentManager.login(student1, "ahmetkirmizi@gmail.com", "456789");
		//studentManager.login(student1, "ahmetkirmizi@gmail.com", "4529"); Hatali Kullanim
		studentManager.displayStudentInformation(student1);
		studentManager.logout(student1);
		System.out.println("-------------------------------------\n");
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(5);
		instructor1.setInstructorNumber(3080);
		instructor1.setFirstName("Engýn");
		instructor1.setLastName("Demirog");
		instructor1.setEmail("engindemirog@gmail.com");
		instructor1.setPassword("engin123");
		instructor1.setContactNumber("05XX XXX XX XX");
		instructor1.setAbilities("Java,C#");
		instructor1.setGivenCourses("Yazýlým Gelistirici Yetistirme Kampi (JAVA + REACT)");
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(6);
		instructor2.setInstructorNumber(3090);
		instructor2.setFirstName("Mahmut");
		instructor2.setLastName("Altin");
		instructor2.setEmail("mahmutaltin@gmail.com");
		instructor2.setPassword("mahmut123");
		instructor2.setContactNumber("05XX XXX XX XX");
		instructor2.setAbilities("Python,Flutter");
		instructor2.setGivenCourses("Sifirdan Zirveye Python Kursu");
		
		
		System.out.println("---------EGITMEN ISLEMLERI---------");
		InstructorManager instructorManager = new InstructorManager();
		Instructor[] instructors = {instructor1,instructor2};
		instructorManager.addMultiple(instructors); // Coklu ekleme
		//instructorManager.add(instructor1); Tekil ekleme
		instructorManager.login(instructor1, "engindemirog@gmail.com", "engin123");
		//instructorManager.login(student1, "ahmetkirmizi@gmail.com", "4529"); Hatali sifre girisi
		instructorManager.displayInstructorInformation(instructor1);
		instructorManager.logout(instructor1);
		System.out.println("-------------------------------------\n");
		
		

	}

}
