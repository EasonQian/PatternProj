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
		// ��д����state�еķ�����ʵ���ض��Ĳ���״̬ת������
		// ��ʱֻ��Ҫ���Ǹ�״̬��ص��߼���������Ҫ���ӵ�ȫ���߼�����ʵ���˺ܺõ��߼��ָ�
	}
}
