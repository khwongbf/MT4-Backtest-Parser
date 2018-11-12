package com.metatradetools.backtest.models;

import com.metatradetools.backtest.models.summary.BacktestSummary;
import com.metatradetools.backtest.models.trades.Trade;

import java.beans.JavaBean;
import java.util.ArrayList;

@JavaBean
public class Backtest {
	
	
	private final BacktestSummary summary = new BacktestSummary();
	private final ArrayList<Trade> trades = new ArrayList<>();
	
	public BacktestSummary getSummary () {
		return summary;
	}
	
	public ArrayList<Trade> getTrades () {
		return trades;
	}
	
	@Override
	public String toString () {
		return "Backtest{" +
				"summary=" + summary +
				", trades=" + trades +
				'}';
	}
}
