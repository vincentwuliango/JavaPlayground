package elegeneous.data;

public record LoginRequest(String username, String password) {
	
	public LoginRequest(String username) {
		this(username, null);
	}
	
	public LoginRequest {
	}
}
