package com.metatradetools.backtest.models.summary.result.detail;

public class TradeSummary {
	private int totalTrades;
	private int shortPositions;
	private int longPositions;
	private int profitTrades;
	private int lossTrades;
	
	private double shortPositionsWinRate;
	private double longPositionsWinRate;
	private double winRate;
	private double lossRate;
	
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
	
	public double getShortPositionsWinRate () {
		return shortPositionsWinRate;
	}
	
	public void setShortPositionsWinRate (double shortPositionsWinRate) {
		this.shortPositionsWinRate = shortPositionsWinRate;
	}
	
	public double getLongPositionsWinRate () {
		return longPositionsWinRate;
	}
	
	public void setLongPositionsWinRate (double longPositionsWinRate) {
		this.longPositionsWinRate = longPositionsWinRate;
	}
	
	public double getWinRate () {
		return winRate;
	}
	
	public void setWinRate (double winRate) {
		this.winRate = winRate;
	}
	
	public double getLossRate () {
		return lossRate;
	}
	
	public void setLossRate (double lossRate) {
		this.lossRate = lossRate;
	}
}
