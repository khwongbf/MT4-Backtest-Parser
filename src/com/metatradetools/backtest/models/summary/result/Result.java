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
	 * The summary of the trades occur during the test.
	 */
	private final TradeSummary tradeSummary = new TradeSummary();
	/**
	 * The amount of profit and loss in the test.
	 */
	private final ProfitAndLoss profitAndLoss = new ProfitAndLoss();
	/**
	 * The drawdown numbers of the entire duration of strategy testing.
	 */
	private final Risks risks = new Risks();
	/**
	 * Minor results that is less likely to be used in analysis
	 */
	private final Miscellaneous miscellaneous = new Miscellaneous();
	
	public TradeSummary getTradeSummary () {
		return tradeSummary;
	}
	
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
