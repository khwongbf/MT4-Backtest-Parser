package com.metatradetools.backtest.models.summary.result.detail.miscellaneous;

public class AveragesByCount {
	private int consecutiveWins;
	private int consecutiveLosses;
	
	public int getConsecutiveWins () {
		return consecutiveWins;
	}
	
	public void setConsecutiveWins (int consecutiveWins) {
		this.consecutiveWins = consecutiveWins;
	}
	
	public int getConsecutiveLosses () {
		return consecutiveLosses;
	}
	
	public void setConsecutiveLosses (int consecutiveLosses) {
		this.consecutiveLosses = consecutiveLosses;
	}
}
