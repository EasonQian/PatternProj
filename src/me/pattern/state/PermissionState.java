package me.pattern.state;

/**
 * 
 * @author eason qian
 * Ӧ�����滻���ʹ����ع��������е�stateת����һ������
 * ���е���������Ϊfinal static�ĸ���ʵ��
 * �������ࣺ��ÿ��һ�������滻Ϊһ��child state, ����������д������ض�������������״̬��صĲ���
 * 
 * + ���ٻ��ȥ���ӵ�״̬�ı������߼�
 * - ����Ӧ�ÿ��ǵ���ͨ�����������ȷ�ʽ�򻯣�ֻ�е��߼����ڸ���ʱ�ſ���ʹ��stateģʽ����������Ӳ���Ҫ�Ĵ�����
 */
public abstract class PermissionState {
	
	public abstract String toString();
	// ���·���������state��д���Ӷ��ò�ͬ����򻯸��ӵ�״̬�߼� 
	public void claimedBy(SystemUser user, SystemPermission permission){}
	public void deniedBy(SystemUser user, SystemPermission permission){}
	public void grantedBy(SystemUser user, SystemPermission permission){}
	
	
	// ʵ����Ϊ����state����
	public final static PermissionState REQUESTED = new PermissionRequested();
	public final static PermissionState CLAIMED = new PermissionClaimed();
	//...
	
	
}
