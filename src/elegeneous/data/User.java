package elegeneous.data;

public class User {
	String username;
	String password;
	
	public User() {
	}
	
	User(String username) {
		this.username = username;
	}
	
	void welcome() {
		System.out.println("Welcome user");
	}
	
	void welcome(String username) {
	
	}
}
