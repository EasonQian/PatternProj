package me.pattern.templateMethod;

import me.pattern.strategy.Loan;

/**
 * 
 * @author eason qian
 * 
 * ͨ����ȡ���������Ƶķ��������Ʒ�������ͬ�ĸ��࣬�Ӷ����������е��ظ�����
 * ������strategyģʽ��ͬʹ�������������ظ���û���ظ���strategy��
 * 
 * ��Ҫ���԰����������ò����ظ�����������ͨ���ڸ����й���һЩ�����ķ���,Ȼ����ϳ�һ�������ĸ��෽��������νtemplate method����
 * Ȼ����������Լ�����Ҫ���в�ͬ�ĵ����������дһ���ض��ķ���
 * 
 * + ͨ���Ѳ������Ϊ�ᵽ�����У�ȥ��������ظ�����
 * + �򻯲���Ч�����ͨ�õ��㷨����
 * + ������������׵ض���һ������
 * - Ϊ�����ɷ������������ʵ�ֺܶ෽����ʱ�򣬲��ʺ�ʹ�ã������Ӵ���ĸ��Ӷ�
 * 
 */ 
public abstract class CapticalStrategy {
	
	public CapticalStrategy() {
	}
	public double capital(Loan loan){
		// ...
		this.riskAmountFor(loan); // �ڳ����е���ͨ�õķ���
		return 0.0;
	}
	
	// ������Ҫʵ�����ͨ�õķ���
	public abstract double riskAmountFor(Loan loan);
	
	// hook method, ������Բ���д�������
	protected double unusedPercentageFor(Loan loan) {
		return 1.0;
	}
	
}
