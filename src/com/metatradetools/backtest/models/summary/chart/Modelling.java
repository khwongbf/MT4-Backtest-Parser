package com.metatradetools.backtest.models.summary.chart;

import java.beans.JavaBean;
import java.math.BigDecimal;

/**
 * Represents the data used in the strategy test and the data integrity.
 *
 * @author Wong Kwan Ho
 * @version 1.0
 */
@JavaBean
public class Modelling {
	/**
	 * The number of candlesticks that is used in the strategy test.
	 */
	private int barsInTest;
	/**
	 * The number of ticks used in the strategy test.
	 */
	private int ticksModelled;
	/**
	 * The modelling quality of the data in the test, expressed in a percentage.
	 * <p>
	 *     This field represents the quality of the data used in the strategy test. A percentage is used to indicate how many ticks were covered when compared to the historic actual data.
	 *     The "%" symbol is removed in storing into this field.
	 * </p>
	 */
	private BigDecimal modellingQuality;
	/**
	 * The number of chart errors of the data used.
	 */
	private int mismatchedChartErrors;
	
	/**
	 * Returns the number of candlesticks based on the time frame and period used in the strategy test.
	 * @return the number of candlesticks
	 * @see #barsInTest
	 * @see com.metatradetools.backtest.models.summary.initial.Inputs#timeframe
	 * @see com.metatradetools.backtest.models.summary.initial.Inputs#startDate
	 * @see com.metatradetools.backtest.models.summary.initial.Inputs#endDate
	 */
	public int getBarsInTest () {
		return barsInTest;
	}
	
	/**
	 * Sets the number of candlesticks used in the strategy test to a designated number
	 * @param barsInTest the new number of candlesticks
	 * @see #barsInTest
	 * @see #getBarsInTest()
	 */
	public void setBarsInTest (int barsInTest) {
		this.barsInTest = barsInTest;
	}
	
	/**
	 * Returns the number of ticks modelled in the strategy test.
	 * @return the number of ticks used
	 * @see #ticksModelled
	 */
	public int getTicksModelled () {
		return ticksModelled;
	}
	
	/**
	 * Sets the number of ticks modelled to the designated number
	 * @param ticksModelled the new number of ticks
	 * @see #ticksModelled
	 * @see #getTicksModelled()
	 */
	public void setTicksModelled (int ticksModelled) {
		this.ticksModelled = ticksModelled;
	}
	
	/**
	 * Returns the quality of data as a percentage.
	 * @return data quality as a percentage
	 * @see #modellingQuality
	 */
	public BigDecimal getModellingQuality () {
		return modellingQuality;
	}
	
	/**
	 * Sets the data quality to the designated percentage.
	 * @param modellingQuality the new percentage of data quality
	 * @see #modellingQuality
	 * @see #getModellingQuality()
	 */
	public void setModellingQuality (BigDecimal modellingQuality) {
		this.modellingQuality = modellingQuality;
	}
	
	/**
	 * Returns the number of chart errors due to mismatches
	 * @return the number of errors
	 * @see #mismatchedChartErrors
	 */
	public int getMismatchedChartErrors () {
		return mismatchedChartErrors;
	}
	
	/**
	 * Sets the number of chart errors due to mismatched to the specified integer
	 * @param mismatchedChartErrors the new number of errors
	 * @see #mismatchedChartErrors
	 * @see #getMismatchedChartErrors()
	 */
	public void setMismatchedChartErrors (int mismatchedChartErrors) {
		this.mismatchedChartErrors = mismatchedChartErrors;
	}
}
