package elegeneous.data;

public class Employee extends User {
	private Level level;
	
	Employee() {
	}
	
	Employee(String username) {
		super(username);
	}
	
	public Level getLevel() {
		return level;
	}
	
	public void setLevel(Level level) {
		this.level = level;
	}
	
	void welcome() {
		System.out.println("Welcome employee");
	}
}
