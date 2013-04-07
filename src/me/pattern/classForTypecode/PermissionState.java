package me.pattern.classForTypecode;

/**
 * 
 * @author eason qian
 * ����������ʹ��룬�滻���Ͳ���ȫ���ֶεıȽϺ͸�ֵ����
 * �ͻ�����Ҫ��ֵ��Ƚ϶�ֻ�ܵ����Ѿ������õİ�ȫ�����ͳ���
 * 
 * + ʹ��ö��������������Ҳ�������������Ǳ�ģʽ�ŵ���:����֧����չ��ʵ�ָ������Ϊ����ö��������������һ��
 * + ����Ƿ��ĸ�ֵ�ͱȽ�
 * - ��ʹ�����Ͳ���ȫ�Ĵ�����Ҫ����Ĵ���
 * 
 */
public class PermissionState {

	/*
	 * ����һ��������ʾ��������Ϊfinal��permissionState��public static����
	 */
	public final static PermissionState REQUESTED = new PermissionState("REQUESTED");
	public final static PermissionState CLAIMED = new PermissionState("CLAIMED");
	
	
	private String stateName;
	
	public PermissionState() {
		// TODO Auto-generated constructor stub
	}
	public PermissionState(String stateName){
		this.setStateName(stateName);
	}
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	
}
