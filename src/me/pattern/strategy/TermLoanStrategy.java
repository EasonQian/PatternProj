package me.pattern.strategy;

public class TermLoanStrategy extends CapticalStrategy{

	public TermLoanStrategy() {
	}
	
	public double captical(Loan loan){
		return 0.0; // term loan calculate logic
	}
	
	public double duration(Loan loan){
		return 0.0; // term loan calculate logic
	}

}
