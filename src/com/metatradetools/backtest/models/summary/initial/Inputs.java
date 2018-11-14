package com.metatradetools.backtest.models.summary.initial;

import com.metatradetools.backtest.models.summary.BacktestSummary;

import java.beans.JavaBean;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

/**
 *  Represents the variables inputted by the user in the strategy test.
 * <p>This class represents the inputs made by user in a strategy test. Accessible only by the {@link BacktestSummary#getInputs() getInputs()} method in a {@link com.metatradetools.backtest.models.summary.BacktestSummary BacktestSummary} instance</p>
 * @author Wong Kwan Ho
 * @version 1.0
 * @see BacktestSummary
 */
@JavaBean
public class Inputs {
	/**
	 * The symbol of the trading instrument.
	 */
	private String symbol;
	
	/**
	 * The time frame used, in the vocabulary of traders.
	 * <p>This field represents the time frame of each candlestick in a candlestick chart, which is commonly used in trading in financial markets</p>
	 * <p> Possible values in Metatrader 4 platform are:
	 * <ul>
	 *     <li>M1</li>
	 *     <li>M5</li>
	 *     <li>M15</li>
	 *     <li>M30</li>
	 *     <li>H1</li>
	 *     <li>H4</li>
	 *     <li>D1</li>
	 *     <li>W1</li>
	 *     <li>MN</li>
	 * </ul>
	 * </p>
	 */
	private String timeframe;
	
	/**
	 * The starting date of the historical strategy test.
	 */
	private GregorianCalendar startDate = new GregorianCalendar(new SimpleTimeZone(3600000*2, "ForexUS", Calendar.MARCH, 2, Calendar.SUNDAY, 0, Calendar.NOVEMBER, 1, Calendar.SUNDAY, 3600000));
	/**
	 * The end date of the historical strategy test.
	 */
	private GregorianCalendar endDate = new GregorianCalendar(new SimpleTimeZone(3600000*2, "ForexUS", Calendar.MARCH, 2, Calendar.SUNDAY, 0, Calendar.NOVEMBER, 1, Calendar.SUNDAY, 3600000));
	
	/**
	 * The frequency of tick used, using descriptions
	 */
	private String model;
	
	/**
	 * The parameters used in the expert advisor, as a string
	 */
	private String parameters;
	
	/**
	 * The initial deposit of the account for the strategy testing on historic data.
	 */
	private double initialDeposit;
	
	/**
	 * The bid-ask spread used in the strategy test
	 */
	private String spread;
	
	public String getSymbol () {
		return symbol;
	}
	
	public void setSymbol (String symbol) {
		this.symbol = symbol;
	}
	
	public String getTimeframe () {
		return timeframe;
	}
	
	public void setTimeframe (String timeframe) {
		this.timeframe = timeframe;
	}
	
	public GregorianCalendar getStartDate () {
		return startDate;
	}
	
	public void setStartDate (GregorianCalendar startDate) {
		this.startDate = startDate;
	}
	
	public GregorianCalendar getEndDate () {
		return endDate;
	}
	
	public void setEndDate (GregorianCalendar endDate) {
		this.endDate = endDate;
	}
	
	public String getModel () {
		return model;
	}
	
	public void setModel (String model) {
		this.model = model;
	}
	
	public String getParameters () {
		return parameters;
	}
	
	public void setParameters (String parameters) {
		this.parameters = parameters;
	}
	
	public double getInitialDeposit () {
		return initialDeposit;
	}
	
	public void setInitialDeposit (double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	
	public String getSpread () {
		return spread;
	}
	
	public void setSpread (String spread) {
		this.spread = spread;
	}
}
