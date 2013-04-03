package me.patern.templateMethod;

import me.pattern.strategy.Loan;

public class CapticalStrategyTermLoan extends CapticalStrategy{

	public CapticalStrategyTermLoan() {
	}
	
	@Override
	public double capital(Loan loan){
		// ���ø����ͨ�÷���, ʵ�������ض�������
		return super.capital(loan) * 2 * super.unusedPercentageFor(loan) ;
		//...
	}
	
	@Override
	public double riskAmountFor(Loan loan) {
		// ��д����ķ���������ʵ�������ض��Ĺ�������
		return 2.0;
	}

}
