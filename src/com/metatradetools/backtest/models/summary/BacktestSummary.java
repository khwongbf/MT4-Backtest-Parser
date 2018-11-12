package com.metatradetools.backtest.models.summary;

import com.metatradetools.backtest.models.summary.chart.Modelling;
import com.metatradetools.backtest.models.summary.initial.Environment;
import com.metatradetools.backtest.models.summary.initial.Inputs;
import com.metatradetools.backtest.models.summary.result.Result;

import java.beans.JavaBean;

@JavaBean
public class BacktestSummary {
	private final Modelling modelling = new Modelling();
	private final Environment environment = new Environment();
	private final Inputs inputs = new Inputs();
	private final Result result = new Result();
	
	public Modelling getModelling () {
		return modelling;
	}
	
	public Environment getEnvironment () {
		return environment;
	}
	
	public Inputs getInputs () {
		return inputs;
	}
	
	public Result getResult () {
		return result;
	}
}
