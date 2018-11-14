package com.metatradetools.backtest.models.summary.result;

import com.metatradetools.backtest.models.summary.result.detail.Miscellaneous;
import com.metatradetools.backtest.models.summary.result.detail.ProfitAndLoss;
import com.metatradetools.backtest.models.summary.result.detail.Risks;
import com.metatradetools.backtest.models.summary.result.detail.TradeSummary;

import java.beans.JavaBean;

/**
 * Represents the results of a strategy test.
 * <p>
 *     This class models the results from a strategy test, represented by {@link com.metatradetools.backtest.models.Backtest Backtest}.
 * </p>
 * <p>
 *     An instance of this class must be accessed by the owner, which is an instance of the {@link com.metatradetools.backtest.models.summary.BacktestSummary BacktestSummary} class.
 * </p>
 * @author Wong Kwan Ho
 * @version 1.0
 */
@JavaBean
public class Result {
	/**
	 * The class that contains summary of the trades occur during the test.
	 */
	private final TradeSummary tradeSummary = new TradeSummary();
	/**
	 * The class that contains amount of profit and loss in the test.
	 */
	private final ProfitAndLoss profitAndLoss = new ProfitAndLoss();
	/**
	 * The class that contains drawdown numbers of the entire duration of strategy testing.
	 */
	private final Risks risks = new Risks();
	/**
	 * The class that contains minor results that is less likely to be used in analysis
	 */
	private final Miscellaneous miscellaneous = new Miscellaneous();
	
	/**
	 * Gets the trade summary of the test, such as the total trades, win rate.
	 * @return the trade summary that this instance has
	 * @see #tradeSummary
	 */
	public TradeSummary getTradeSummary () {
		return tradeSummary;
	}
	
	/**
	 *  Gets the details of profits and losses.
	 * @return the profit and losses that this instance has
	 */
	public ProfitAndLoss getProfitAndLoss () {
		return profitAndLoss;
	}
	
	public Risks getRisks () {
		return risks;
	}
	
	public Miscellaneous getMiscellaneous () {
		return miscellaneous;
	}
}
