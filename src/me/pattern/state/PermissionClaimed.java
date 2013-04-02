package me.pattern.state;

public class PermissionClaimed extends PermissionState{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override 
	public void deniedBy(SystemUser user, SystemPermission permission){
		// ...
		// 重写父类state中的方法，实现特定的部分状态转化操作
	}
	
}
