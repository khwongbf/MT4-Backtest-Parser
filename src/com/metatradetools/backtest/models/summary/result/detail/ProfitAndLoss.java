package com.metatradetools.backtest.models.summary.result.detail;

public class ProfitAndLoss {
	private double totalNetProfit;
	private double grossProfit;
	private double grossLoss;
	private double profitFactor;
	private double expectedPayoff;
	
	public double getTotalNetProfit () {
		return totalNetProfit;
	}
	
	public void setTotalNetProfit (double totalNetProfit) {
		this.totalNetProfit = totalNetProfit;
	}
	
	public double getGrossProfit () {
		return grossProfit;
	}
	
	public void setGrossProfit (double grossProfit) {
		this.grossProfit = grossProfit;
	}
	
	public double getGrossLoss () {
		return grossLoss;
	}
	
	public void setGrossLoss (double grossLoss) {
		this.grossLoss = grossLoss;
	}
	
	public double getProfitFactor () {
		return profitFactor;
	}
	
	public void setProfitFactor (double profitFactor) {
		this.profitFactor = profitFactor;
	}
	
	public double getExpectedPayoff () {
		return expectedPayoff;
	}
	
	public void setExpectedPayoff (double expectedPayoff) {
		this.expectedPayoff = expectedPayoff;
	}
}
