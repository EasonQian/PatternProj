package me.pattern.strategy;

public abstract class CapticalStrategy {

	public CapticalStrategy() {
	}
	
	public abstract double captical(Loan loan); // capital must be implemented by child class
	
	public double duration(Loan loan){
		return 0.0;
	}
	
}
