package com.metatradetools.backtest.models.summary.result.detail.miscellaneous;

import java.math.BigDecimal;

public class MaximumsByMoney {
	private BigDecimal consecutiveProfit;
	private int consecutiveCountOfWins;
	private BigDecimal consecutiveLoss;
	private int consecutiveCountOfLosses;
	
	public BigDecimal getConsecutiveProfit () {
		return consecutiveProfit;
	}
	
	public void setConsecutiveProfit (BigDecimal consecutiveProfit) {
		this.consecutiveProfit = consecutiveProfit;
	}
	
	public int getConsecutiveCountOfWins () {
		return consecutiveCountOfWins;
	}
	
	public void setConsecutiveCountOfWins (int consecutiveCountOfWins) {
		this.consecutiveCountOfWins = consecutiveCountOfWins;
	}
	
	public BigDecimal getConsecutiveLoss () {
		return consecutiveLoss;
	}
	
	public void setConsecutiveLoss (BigDecimal consecutiveLoss) {
		this.consecutiveLoss = consecutiveLoss;
	}
	
	public int getConsecutiveCountOfLosses () {
		return consecutiveCountOfLosses;
	}
	
	public void setConsecutiveCountOfLosses (int consecutiveCountOfLosses) {
		this.consecutiveCountOfLosses = consecutiveCountOfLosses;
	}
}
