package com.metatradetools.backtest.models.summary.result.detail.miscellaneous;

public class MaximumsByMoney {
	private double consecutiveProfit;
	private int consecutiveCountOfWins;
	private double consecutiveLoss;
	private int consecutiveCountOfLosses;
	
	public double getConsecutiveProfit () {
		return consecutiveProfit;
	}
	
	public void setConsecutiveProfit (double consecutiveProfit) {
		this.consecutiveProfit = consecutiveProfit;
	}
	
	public int getConsecutiveCountOfWins () {
		return consecutiveCountOfWins;
	}
	
	public void setConsecutiveCountOfWins (int consecutiveCountOfWins) {
		this.consecutiveCountOfWins = consecutiveCountOfWins;
	}
	
	public double getConsecutiveLoss () {
		return consecutiveLoss;
	}
	
	public void setConsecutiveLoss (double consecutiveLoss) {
		this.consecutiveLoss = consecutiveLoss;
	}
	
	public int getConsecutiveCountOfLosses () {
		return consecutiveCountOfLosses;
	}
	
	public void setConsecutiveCountOfLosses (int consecutiveCountOfLosses) {
		this.consecutiveCountOfLosses = consecutiveCountOfLosses;
	}
}
