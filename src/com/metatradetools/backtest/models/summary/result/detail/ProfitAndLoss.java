package com.metatradetools.backtest.models.summary.result.detail;

import java.math.BigDecimal;

public class ProfitAndLoss {
	private BigDecimal totalNetProfit;
	private BigDecimal grossProfit;
	private BigDecimal grossLoss;
	private BigDecimal profitFactor;
	private BigDecimal expectedPayoff;
	
	public BigDecimal getTotalNetProfit () {
		return totalNetProfit;
	}
	
	public void setTotalNetProfit (BigDecimal totalNetProfit) {
		this.totalNetProfit = totalNetProfit;
	}
	
	public BigDecimal getGrossProfit () {
		return grossProfit;
	}
	
	public void setGrossProfit (BigDecimal grossProfit) {
		this.grossProfit = grossProfit;
	}
	
	public BigDecimal getGrossLoss () {
		return grossLoss;
	}
	
	public void setGrossLoss (BigDecimal grossLoss) {
		this.grossLoss = grossLoss;
	}
	
	public BigDecimal getProfitFactor () {
		return profitFactor;
	}
	
	public void setProfitFactor (BigDecimal profitFactor) {
		this.profitFactor = profitFactor;
	}
	
	public BigDecimal getExpectedPayoff () {
		return expectedPayoff;
	}
	
	public void setExpectedPayoff (BigDecimal expectedPayoff) {
		this.expectedPayoff = expectedPayoff;
	}
}
