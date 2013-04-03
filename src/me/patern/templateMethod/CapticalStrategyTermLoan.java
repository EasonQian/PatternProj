package me.patern.templateMethod;

import me.pattern.strategy.Loan;

public class CapticalStrategyTermLoan extends CapticalStrategy{

	public CapticalStrategyTermLoan() {
	}
	
	@Override
	public double capital(Loan loan){
		// 调用父类的通用方法, 实现子类特定的需求
		return super.capital(loan) * 2 * super.unusedPercentageFor(loan) ;
		//...
	}
	
	@Override
	public double riskAmountFor(Loan loan) {
		// 重写父类的方法，用于实现子类特定的功能需求
		return 2.0;
	}

}
