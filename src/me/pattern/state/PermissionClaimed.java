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
		// ��д����state�еķ�����ʵ���ض��Ĳ���״̬ת������
	}
	
}
