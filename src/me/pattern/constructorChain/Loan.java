package me.pattern.constructorChain;

import java.util.Date;

import me.pattern.strategy.CapticalStrategy;
import me.pattern.strategy.TermLoanStrategy;

/**
 * 
 * @author eason qian
 * ͨ�����캯�����������ٹ��캯���е��ظ�����
 * ����Ĺ��캯������ø���ͨ�õĹ��캯����ֱ���������һ�����캯��
 * �����ÿ�����ӵ�ĩ�˶���һ�����캯������ô������ȫ�������캯����catch-all constructor)����Ϊ���ᴦ�����еĹ��캯������
 * 
 * ������Ĺ��캯�������˿����ԣ�������create method�滻���캯��
 */
public class Loan {

	public Loan() {
		// TODO Auto-generated constructor stub
	}

	public Loan(float notional, float outstanding, int rating, Date expiry) {
		/*
		 * ���ø���ͨ�õĹ��캯��������û���ṩ�Ĳ���������nullֵ��Ĭ��ֵ
		 */
		this(new TermLoanStrategy(), notional, outstanding, rating, expiry, null);
	}

	public Loan(float notional, float outstanding, int rating, Date expiry,
			Date maturity) {
		/*
		 * ���ø���ͨ�õĹ��캯��������û���ṩ�Ĳ���������nullֵ��Ĭ��ֵ
		 */
		this(new TermLoanStrategy(), notional, outstanding, rating, expiry, maturity);
	}

	public Loan(CapticalStrategy strategy, float notional, float outstanding,
			int rating, Date expiry, Date maturity) {

	}

}
