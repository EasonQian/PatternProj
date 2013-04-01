package me.pattern.strategy;

import java.util.Date;

public class Loan {

	// strategy��Ϊί�����һ�����Դ��ڣ��������Ϊί�����һ�����㷽��
	// ����ί����Ĳ�ͬ�������в�ͬ�ļ��㷽������˾ͻ��ж���child strategy��ʵ��
	// ���ö�̬�����ԣ�������ʱ�����ʵ�ʵ�strategy������ѡ��ͬ�ļ��㷽�����Ӷ�ʵ����ί�е�Ŀ��
	// 
	// + �ܺõ�ʵ����ί���ิ�������߼��ķ��룬��Բ�ͬ�������ֲ�ͬ�Ĵ�����
	// + ����������ʱ���ݲ�ͬ�Ĳ����滻��һ���㷨
	// - ��Ҫ��дһ�����Ĵ���
	// - ��Ҫ����ί���ࣨ�����ģ�����Ϣ
	
	private CapticalStrategy capticalStrategy; 

	private Loan(double commitment, double outstanding, Date start,
			Date expiry, Date maturity, int riskRanking,
			CapticalStrategy capticalStrategy) {
		this.capticalStrategy = capticalStrategy; // ����ί�е�ֵ
	}

	// e.g.
	public static Loan newTermLoan(double commitment, Date start,
			Date maturity, int riskRanking) {
		return new Loan(commitment, commitment, start, null, maturity,
				riskRanking, new TermLoanStrategy()); // use child class of CapticalStrategy
	}

	public double captical() {
		// ��������ʵ�����е�CapticalStrategy����������capital�ļ���
		return this.capticalStrategy.captical(this); // ʹLoanί��CapticalStrategy���ʽ���㷽��
	}

	public double duration() {
		return this.capticalStrategy.duration(this); // ί��
	}
}
