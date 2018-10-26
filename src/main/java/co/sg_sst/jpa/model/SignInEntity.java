package co.sg_sst.jpa.model;

import org.springframework.data.annotation.Id;

public class SignInEntity {
	
	@Id
	public String email;
	private String password;
	
	public SignInEntity() {
	}

	public SignInEntity(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
