package com.metatradetools.backtest.models.summary.result.detail.miscellaneous;

import java.math.BigDecimal;

public class AveragesByMoney {
	private BigDecimal profitTrade;
	private BigDecimal lossTrade;
	
	public BigDecimal getProfitTrade () {
		return profitTrade;
	}
	
	public void setProfitTrade (BigDecimal profitTrade) {
		this.profitTrade = profitTrade;
	}
	
	public BigDecimal getLossTrade () {
		return lossTrade;
	}
	
	public void setLossTrade (BigDecimal lossTrade) {
		this.lossTrade = lossTrade;
	}
}
