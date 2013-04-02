package me.pattern.state;

public class SystemPermission {

	/**
	 * 用状态类型PermissionState替换原来的普通state字段
	 * 这样就可以将复杂的状态转换逻辑搬移到PermissionState类中，从而简化原来类中的逻辑
	 */
	private PermissionState state; 
	
	public SystemPermission() {
		// ...
		this.setState(PermissionState.REQUESTED); // 设置初始state
	}
	
	public void claimedBy(SystemUser user){
		/**
		 * 调用PermissionState中的相应逻辑
		 */
		
	}
	
	public void setState(PermissionState state){
		this.state = state;
	}
	public PermissionState getState(){
		return this.state;
	}

}
