package co.sg_sst.jpa.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class UserEntity {

	@Id
	public String id;
	private String name;
	private String area;
	private String username;
	private String password;
	private List<String> permissions;

	public UserEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public UserEntity(String id, String name, String area, String username, String password, List<String> permissions) {
		this.id = id;
		this.name = name;
		this.area = area;
		this.username = username;
		this.password = password;
		this.permissions = permissions;
	}

	public UserEntity(String name, String area, String username, String password, List<String> permissions) {
		this.name = name;
		this.area = area;
		this.username = username;
		this.password = password;
		this.permissions = permissions;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

}
