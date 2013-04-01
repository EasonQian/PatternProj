package me.pattern.strategy;

import java.util.Date;

public class Loan {

	// strategy作为委托类的一个属性存在，可以理解为委托类的一个计算方法
	// 根据委托类的不同参数，有不同的计算方法，因此就会有多种child strategy被实现
	// 利用多态的特性，在运行时会根据实际的strategy类型来选择不同的计算方法，从而实现了委托的目的
	// 
	// + 很好地实现了委托类复杂条件逻辑的分离，针对不同的条件又不同的处理方法
	// + 允许在运行时根据不同的参数替换另一种算法
	// - 需要编写一定量的代码
	// - 需要传递委托类（上下文）的信息
	
	private CapticalStrategy capticalStrategy; 

	private Loan(double commitment, double outstanding, Date start,
			Date expiry, Date maturity, int riskRanking,
			CapticalStrategy capticalStrategy) {
		this.capticalStrategy = capticalStrategy; // 设置委托的值
	}

	// e.g.
	public static Loan newTermLoan(double commitment, Date start,
			Date maturity, int riskRanking) {
		return new Loan(commitment, commitment, start, null, maturity,
				riskRanking, new TermLoanStrategy()); // use child class of CapticalStrategy
	}

	public double captical() {
		// 这里会根据实际运行的CapticalStrategy子类来进行capital的计算
		return this.capticalStrategy.captical(this); // 使Loan委托CapticalStrategy的资金计算方法
	}

	public double duration() {
		return this.capticalStrategy.duration(this); // 委托
	}
}
