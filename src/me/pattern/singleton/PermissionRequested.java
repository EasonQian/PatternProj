package me.pattern.singleton;

import me.pattern.classForTypecode.PermissionState;

/**
 * 
 * @author eason qian
 * ��һ��singleton������ʵ�������creation method��static���ʿ���
 * 
 * + �Ľ�����
 * - ���κεط������Ժ����׵ط��ʣ��ںܶ�����¿��ܳ�Ϊ��Ƶ�һ��ȱ��
 * - ������֮�京�в��ܹ����״̬ʱ���ع���Ч
 */
public class PermissionRequested extends PermissionState{

	/*
	 * 2. ��������singleton�ֶΣ�ͬ��ʹ�ø�������������
	 */
	private static PermissionState state = new PermissionRequested();
	
	/*
	 * 1. �����캯��ת����creation method
	 * ʹ�ø�����Ϊ�ӿڵķ������ͣ��Ӷ�ϣ���ͻ��˴��붼ͨ������������������н���
	 * ���������У������캯�������е����߸���Ϊ�������creation method
	 */
	public static PermissionState requestedStateIns(){
//		return new PermissionRequested();
		/*
		 * 3. ����singleton�ֶε�ֵ
		 * ����ö�����Ҫ����ʵ�������ڴ˴��������ʵ�ֳ�ʵ������newһ��������
		 */
		return state;
	}

}
