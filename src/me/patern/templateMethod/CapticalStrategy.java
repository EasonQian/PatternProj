package me.patern.templateMethod;

import me.pattern.strategy.Loan;

/**
 * 
 * @author eason qian
 * 
 * 通过提取子类中相似的方法，上移方法到共同的父类，从而消除子类中的重复代码
 * 可以与strategy模式共同使用来建立很少重复或没有重复的strategy类
 * 
 * + 通过把不变的行为搬到超类中，去除子类的重复代码
 * + 简化并有效表达了通用的算法步骤
 * + 允许子类很容易地定制一个方法
 * - 为了生成方法，子类必须实现很多方法的时候，不适合使用，会增加代码的复杂度
 * 
 */ 
public abstract class CapticalStrategy {
	
	public CapticalStrategy() {
	}
	public double capital(Loan loan){
		// ...
		this.riskAmountFor(loan); // 在超类中调用通用的方法
		return 0.0;
	}
	
	// 子类需要实现这个通用的方法
	public abstract double riskAmountFor(Loan loan);
	
	// hook method, 子类可以不重写这个方法
	protected double unusedPercentageFor(Loan loan) {
		return 1.0;
	}
	
}
