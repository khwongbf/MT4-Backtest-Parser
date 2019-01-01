package com.metatradetools.backtest.models.summary.result.detail.miscellaneous;

import java.math.BigDecimal;

public class MaximumsByCount {
	private int consecutiveWins;
	private BigDecimal consecutiveProfitInMoney;
	private int consecutiveLosses;
	private BigDecimal consecutiveLossInMoney;
	
	public int getConsecutiveWins () {
		return consecutiveWins;
	}
	
	public void setConsecutiveWins (int consecutiveWins) {
		this.consecutiveWins = consecutiveWins;
	}
	
	public BigDecimal getConsecutiveProfitInMoney () {
		return consecutiveProfitInMoney;
	}
	
	public void setConsecutiveProfitInMoney (BigDecimal consecutiveProfitInMoney) {
		this.consecutiveProfitInMoney = consecutiveProfitInMoney;
	}
	
	public int getConsecutiveLosses () {
		return consecutiveLosses;
	}
	
	public void setConsecutiveLosses (int consecutiveLosses) {
		this.consecutiveLosses = consecutiveLosses;
	}
	
	public BigDecimal getConsecutiveLossInMoney () {
		return consecutiveLossInMoney;
	}
	
	public void setConsecutiveLossInMoney (BigDecimal consecutiveLossInMoney) {
		this.consecutiveLossInMoney = consecutiveLossInMoney;
	}
}
