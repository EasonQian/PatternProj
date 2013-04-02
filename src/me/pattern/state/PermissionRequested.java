package me.pattern.state;

public class PermissionRequested extends PermissionState{


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void claimedBy(SystemUser user, SystemPermission permission){
		// ...
		// 重写父类state中的方法，实现特定的部分状态转化操作
		// 此时只需要考虑该状态相关的逻辑，而不需要复杂的全部逻辑处理，实现了很好的逻辑分割
	}
}
