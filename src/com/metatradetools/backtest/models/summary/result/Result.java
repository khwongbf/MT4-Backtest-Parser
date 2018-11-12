package com.metatradetools.backtest.models.summary.result;

import com.metatradetools.backtest.models.summary.result.detail.Miscellaneous;
import com.metatradetools.backtest.models.summary.result.detail.ProfitAndLoss;
import com.metatradetools.backtest.models.summary.result.detail.Risks;
import com.metatradetools.backtest.models.summary.result.detail.TradeSummary;

import java.beans.JavaBean;

@JavaBean
public class Result {
	private final TradeSummary tradeSummary = new TradeSummary();
	private final ProfitAndLoss profitAndLoss = new ProfitAndLoss();
	private final Risks risks = new Risks();
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
