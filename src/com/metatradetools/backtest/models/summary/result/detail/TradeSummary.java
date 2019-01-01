package com.metatradetools.backtest.models.summary.result.detail;

import java.math.BigDecimal;

public class TradeSummary {
	private int totalTrades;
	private int shortPositions;
	private int longPositions;
	private int profitTrades;
	private int lossTrades;
	
	private BigDecimal shortPositionsWinRate;
	private BigDecimal longPositionsWinRate;
	private BigDecimal winRate;
	private BigDecimal lossRate;
	
	public int getTotalTrades () {
		return totalTrades;
	}
	
	public void setTotalTrades (int totalTrades) {
		this.totalTrades = totalTrades;
	}
	
	public int getShortPositions () {
		return shortPositions;
	}
	
	public void setShortPositions (int shortPositions) {
		this.shortPositions = shortPositions;
	}
	
	public int getLongPositions () {
		return longPositions;
	}
	
	public void setLongPositions (int longPositions) {
		this.longPositions = longPositions;
	}
	
	public int getProfitTrades () {
		return profitTrades;
	}
	
	public void setProfitTrades (int profitTrades) {
		this.profitTrades = profitTrades;
	}
	
	public int getLossTrades () {
		return lossTrades;
	}
	
	public void setLossTrades (int lossTrades) {
		this.lossTrades = lossTrades;
	}
	
	public BigDecimal getShortPositionsWinRate () {
		return shortPositionsWinRate;
	}
	
	public void setShortPositionsWinRate (BigDecimal shortPositionsWinRate) {
		this.shortPositionsWinRate = shortPositionsWinRate;
	}
	
	public BigDecimal getLongPositionsWinRate () {
		return longPositionsWinRate;
	}
	
	public void setLongPositionsWinRate (BigDecimal longPositionsWinRate) {
		this.longPositionsWinRate = longPositionsWinRate;
	}
	
	public BigDecimal getWinRate () {
		return winRate;
	}
	
	public void setWinRate (BigDecimal winRate) {
		this.winRate = winRate;
	}
	
	public BigDecimal getLossRate () {
		return lossRate;
	}
	
	public void setLossRate (BigDecimal lossRate) {
		this.lossRate = lossRate;
	}
}
