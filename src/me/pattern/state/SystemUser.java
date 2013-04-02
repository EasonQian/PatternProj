package me.pattern.state;

public class SystemUser {

	private int id;
	private String name;
	private PermissionState permission;
	
	public SystemUser() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PermissionState getPermission() {
		return permission;
	}

	public void setPermission(PermissionState permission) {
		this.permission = permission;
	}

}
