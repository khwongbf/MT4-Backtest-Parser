package com.metatradetools.backtest.models.summary.result.detail.miscellaneous;

public class MaximumsByCount {
	private int consecutiveWins;
	private double consecutiveProfitInMoney;
	private int consecutiveLosses;
	private double consecutiveLossInMoney;
	
	public int getConsecutiveWins () {
		return consecutiveWins;
	}
	
	public void setConsecutiveWins (int consecutiveWins) {
		this.consecutiveWins = consecutiveWins;
	}
	
	public double getConsecutiveProfitInMoney () {
		return consecutiveProfitInMoney;
	}
	
	public void setConsecutiveProfitInMoney (double consecutiveProfitInMoney) {
		this.consecutiveProfitInMoney = consecutiveProfitInMoney;
	}
	
	public int getConsecutiveLosses () {
		return consecutiveLosses;
	}
	
	public void setConsecutiveLosses (int consecutiveLosses) {
		this.consecutiveLosses = consecutiveLosses;
	}
	
	public double getConsecutiveLossInMoney () {
		return consecutiveLossInMoney;
	}
	
	public void setConsecutiveLossInMoney (double consecutiveLossInMoney) {
		this.consecutiveLossInMoney = consecutiveLossInMoney;
	}
}
