package me.pattern.state;

public class SystemPermission {

	/**
	 * ��״̬����PermissionState�滻ԭ������ͨstate�ֶ�
	 * �����Ϳ��Խ����ӵ�״̬ת���߼����Ƶ�PermissionState���У��Ӷ���ԭ�����е��߼�
	 */
	private PermissionState state; 
	
	public SystemPermission() {
		// ...
		this.setState(PermissionState.REQUESTED); // ���ó�ʼstate
	}
	
	public void claimedBy(SystemUser user){
		/**
		 * ����PermissionState�е���Ӧ�߼�
		 */
		
	}
	
	public void setState(PermissionState state){
		this.state = state;
	}
	public PermissionState getState(){
		return this.state;
	}

}
