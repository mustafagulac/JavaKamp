package ucuncuGunOdev;


public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " sisteme eklendi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {	
			add(user);
		}   
	}
	
	public void login(User user, String mail, String password) {
		if(user.getEmail()== mail && user.getPassword()==password) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Sisteme giris yapti.");
		}
		else {
			System.out.println("Email veya þifre hatalý");
		}
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName()+" " + user.getLastName()+ " sistemden cikis yapti.");
	}
}
