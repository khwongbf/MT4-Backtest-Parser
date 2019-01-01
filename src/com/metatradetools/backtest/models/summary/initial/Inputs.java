package com.metatradetools.backtest.models.summary.initial;

import com.metatradetools.backtest.models.summary.BacktestSummary;

import java.beans.JavaBean;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

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
	private ZonedDateTime startDate;
	/**
	 * The end date of the historical strategy test.
	 */
	private ZonedDateTime endDate;
	/**
	 * The frequency of tick used, i.e. the model of data sampling, using descriptions
	 */
	private String model;
	/**
	 * The parameters used in the expert advisor, as a string
	 * <p>
	 *     Note that ";" is used as a delimiter to separate between parameters
	 * </p>
	 */
	private String parameters;
	/**
	 * The initial deposit of the account for the strategy testing on historic data.
	 */
	private BigDecimal initialDeposit;
	/**
	 * The bid-ask spread used in the strategy test
	 */
	private String spread;
	
	/**
	 * Returns the symbol of the instrument used in the strategy test
	 * @return the symbol of the trading instrument used
	 * @see #symbol
	 */
	public String getSymbol () {
		return symbol;
	}
	
	/**
	 * Modifies the symbol of the trading instrument to the designated symbol
	 * @param symbol the new symbol
	 * @see #symbol
	 * @see #getSymbol()
	 */
	public void setSymbol (String symbol) {
		this.symbol = symbol;
	}
	
	/**
	 * Returns the time frame used for charts in the strategy test.
	 * @return the time frame used in strategy test
	 * @see #timeframe
	 */
	public String getTimeframe () {
		return timeframe;
	}
	
	/**
	 * Modifies the time frame of the chart used in the strategy test to the designated time frame.
	 * @param timeframe The new time frame of the chart
	 * @see #timeframe
	 * @see #getTimeframe()
	 */
	public void setTimeframe (String timeframe) {
		this.timeframe = timeframe;
	}
	
	/**
	 * Returns the starting historical point of time of the strategy test.
	 * @return the starting point of time of the strategy test
	 * @see #startDate
	 */
	public ZonedDateTime getStartDate () {
		return startDate;
	}
	
	/**
	 * Modifies the starting historical point of time the strategy test to the designated date and time.
	 * @param startDate the new starting point
	 * @see #startDate
	 * @see #getStartDate()
	 */
	public void setStartDate (ZonedDateTime startDate) {
		this.startDate = startDate;
	}
	
	/**
	 * Returns the ending historical point of time applied in the strategy test.
	 * @return the end date of the strategy test
	 * @see #endDate
	 */
	public ZonedDateTime getEndDate () {
		return endDate;
	}
	
	/**
	 * Modifies the end data point of the strategy test to the specified date and time.
	 * @param endDate the new end date
	 * @see #endDate
	 * @see #getEndDate()
	 */
	public void setEndDate (ZonedDateTime endDate) {
		this.endDate = endDate;
	}
	
	/**
	 * Returns the model of data sampling used in the strategy test
	 * @return the model
	 * @see #model
	 */
	public String getModel () {
		return model;
	}
	
	/**
	 * Modifies the model of data sampling used in the strategy test to the designated model.
	 * @param model the new model of data sampling
	 * @see #model
	 * @see #getModel()
	 */
	public void setModel (String model) {
		this.model = model;
	}
	
	/**
	 * Returns the parameters used for the expert advisor that is used in the strategy test.
	 * <p>
	 *     This method returns the settings used for the expert advisor in the strategy test.
	 * </p>
	 * @return all parameters as a single string
	 * @see #parameters
	 */
	public String getParameters () {
		return parameters;
	}
	
	/**
	 * Modifies the parameters to the specified String.
	 * @param parameters the new parameters to be set to
	 * @see #parameters
	 * @see #getParameters()
	 */
	public void setParameters (String parameters) {
		this.parameters = parameters;
	}
	
	/**
	 * Returns the initial account deposit used in the strategy test.
	 * @return the account deposit when  initialized test
	 * @see #initialDeposit
	 */
	public BigDecimal getInitialDeposit () {
		return initialDeposit;
	}
	
	/**
	 * Initialize the account deposit to the specified one.
	 * @param initialDeposit the account deposit to be initialized
	 * @see #initialDeposit
	 * @see #getInitialDeposit()
	 */
	public void setInitialDeposit (BigDecimal initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	
	/**
	 * Returns the bid-ask spread of the underlying instrument used in the test, stored as a string.
	 * @return the spread used in the test
	 * @see #spread
	 */
	public String getSpread () {
		return spread;
	}
	
	/**
	 * Sets the bid-ask spread of the strategy test to the specified string
	 * @param spread the new bid-ask spread
	 * @see #spread
	 * @see #getSpread()
	 */
	public void setSpread (String spread) {
		this.spread = spread;
	}
}
