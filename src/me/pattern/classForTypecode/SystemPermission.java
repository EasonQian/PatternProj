package me.pattern.classForTypecode;

public class SystemPermission {

	/*
	 * 使用类类型重建类型安全字段，并修改所有的引用
	 */
	private PermissionState state;
	
	public SystemPermission() {
		this.setState(PermissionState.REQUESTED);
	}

	public void claimed(){
		/*
		 * 通过新建的安全类型进行赋值和比较
		 */
		if (this.getState().equals(PermissionState.REQUESTED)) {
			this.setState(PermissionState.CLAIMED);
		}
	}
	
	
	public PermissionState getState() {
		return state;
	}

	public void setState(PermissionState state) {
		this.state = state;
	}

	
	
}
