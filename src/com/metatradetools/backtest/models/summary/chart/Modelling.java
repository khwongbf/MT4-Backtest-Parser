package com.metatradetools.backtest.models.summary.chart;

import java.beans.JavaBean;

@JavaBean
public class Modelling {
	private int barsInTest;
	private int ticksModelled;
	private double modellingQuality;
	private int mismatchedChartErrors;
	
	public int getBarsInTest () {
		return barsInTest;
	}
	
	public void setBarsInTest (int barsInTest) {
		this.barsInTest = barsInTest;
	}
	
	public int getTicksModelled () {
		return ticksModelled;
	}
	
	public void setTicksModelled (int ticksModelled) {
		this.ticksModelled = ticksModelled;
	}
	
	public double getModellingQuality () {
		return modellingQuality;
	}
	
	public void setModellingQuality (double modellingQuality) {
		this.modellingQuality = modellingQuality;
	}
	
	public int getMismatchedChartErrors () {
		return mismatchedChartErrors;
	}
	
	public void setMismatchedChartErrors (int mismatchedChartErrors) {
		this.mismatchedChartErrors = mismatchedChartErrors;
	}
}
