package me.pattern.constructorChain;

import java.util.Date;

import me.pattern.strategy.CapticalStrategy;
import me.pattern.strategy.TermLoanStrategy;

/**
 * 
 * @author eason qian
 * 通过构造函数链接来减少构造函数中的重复代码
 * 特殊的构造函数会调用更加通用的构造函数，直到到达最后一个构造函数
 * 如果在每个链接的末端都有一个构造函数，那么它就是全包含构造函数（catch-all constructor)，因为它会处理所有的构造函数调用
 * 
 * 如果许多的构造函数降低了可用性，考虑用create method替换构造函数
 */
public class Loan {

	public Loan() {
		// TODO Auto-generated constructor stub
	}

	public Loan(float notional, float outstanding, int rating, Date expiry) {
		/*
		 * 调用更加通用的构造函数，对于没有提供的参数，传入null值或默认值
		 */
		this(new TermLoanStrategy(), notional, outstanding, rating, expiry, null);
	}

	public Loan(float notional, float outstanding, int rating, Date expiry,
			Date maturity) {
		/*
		 * 调用更加通用的构造函数，对于没有提供的参数，传入null值或默认值
		 */
		this(new TermLoanStrategy(), notional, outstanding, rating, expiry, maturity);
	}

	public Loan(CapticalStrategy strategy, float notional, float outstanding,
			int rating, Date expiry, Date maturity) {

	}

}
