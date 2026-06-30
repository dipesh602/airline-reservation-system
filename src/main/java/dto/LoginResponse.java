package dto;

import lombok.Data;

@Data
public class LoginResponse {
	
	private String token,role,message ;

	public LoginResponse(String token, String role, String message) {
		super();
		this.token = token;
		this.role = role;
		this.message = message;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
