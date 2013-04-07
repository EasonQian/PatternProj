package me.pattern.classForTypecode;

public class SystemPermission {

	/*
	 * ʹ���������ؽ����Ͱ�ȫ�ֶΣ����޸����е�����
	 */
	private PermissionState state;
	
	public SystemPermission() {
		this.setState(PermissionState.REQUESTED);
	}

	public void claimed(){
		/*
		 * ͨ���½��İ�ȫ���ͽ��и�ֵ�ͱȽ�
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
