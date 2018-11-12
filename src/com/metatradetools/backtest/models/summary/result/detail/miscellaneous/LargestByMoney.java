package com.metatradetools.backtest.models.summary.result.detail.miscellaneous;

public class LargestByMoney {
	private double profitTrade;
	private double lossTrade;
	
	public double getProfitTrade () {
		return profitTrade;
	}
	
	public void setProfitTrade (double profitTrade) {
		this.profitTrade = profitTrade;
	}
	
	public double getLossTrade () {
		return lossTrade;
	}
	
	public void setLossTrade (double lossTrade) {
		this.lossTrade = lossTrade;
	}
}
