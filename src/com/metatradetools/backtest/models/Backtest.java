package com.metatradetools.backtest.models;

import com.metatradetools.backtest.models.summary.BacktestSummary;
import com.metatradetools.backtest.models.trades.Trade;

import java.beans.JavaBean;
import java.util.ArrayList;

/**
 * Represents a strategy tester report.
 * <p>
 *     A strategy tester report that consists of two parts: the summary and the list of trades.
 * </p>
 *
 * @author Wong Kwan Ho
 * @version 1.0
 */
@JavaBean
public class Backtest {
	
	/**
	 * Summary of the strategy tester report, i.e. everything up to the image
	 * @see BacktestSummary
	 */
	private final BacktestSummary summary = new BacktestSummary();
	
	/**
	 * The execution of each trade that appear in the last table of the report, in chronological order.
	 * @see Trade
	 */
	private final ArrayList<Trade> trades = new ArrayList<>();
	
	/**
	 * Returns the summary of the report as an object
	 * @return the summary of the report
	 * @since 1.0
	 * @see #summary
	 * @see BacktestSummary
	 */
	public BacktestSummary getSummary () {
		return summary;
	}
	
	/**
	 * Returns the executions of trades in the report, in chronological order.
	 * @return the chronological executions of trades in the report
	 * @since 1.0
	 * @see #trades
	 * @see Trade
	 */
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
