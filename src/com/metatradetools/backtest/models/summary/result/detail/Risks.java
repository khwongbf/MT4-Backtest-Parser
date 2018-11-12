package com.metatradetools.backtest.models.summary.result.detail;

public class Risks {
	private double absoluteDrawdown;
	private double maximalDrawdownAbsolute;
	private double maximalDrawdownPercentage;
	private double relativeDrawdownAbsolute;
	private double relativeDrawdownPercentage;
	
	public double getAbsoluteDrawdown () {
		return absoluteDrawdown;
	}
	
	public void setAbsoluteDrawdown (double absoluteDrawdown) {
		this.absoluteDrawdown = absoluteDrawdown;
	}
	
	public double getMaximalDrawdownAbsolute () {
		return maximalDrawdownAbsolute;
	}
	
	public void setMaximalDrawdownAbsolute (double maximalDrawdownAbsolute) {
		this.maximalDrawdownAbsolute = maximalDrawdownAbsolute;
	}
	
	public double getMaximalDrawdownPercentage () {
		return maximalDrawdownPercentage;
	}
	
	public void setMaximalDrawdownPercentage (double maximalDrawdownPercentage) {
		this.maximalDrawdownPercentage = maximalDrawdownPercentage;
	}
	
	public double getRelativeDrawdownAbsolute () {
		return relativeDrawdownAbsolute;
	}
	
	public void setRelativeDrawdownAbsolute (double relativeDrawdownAbsolute) {
		this.relativeDrawdownAbsolute = relativeDrawdownAbsolute;
	}
	
	public double getRelativeDrawdownPercentage () {
		return relativeDrawdownPercentage;
	}
	
	public void setRelativeDrawdownPercentage (double relativeDrawdownPercentage) {
		this.relativeDrawdownPercentage = relativeDrawdownPercentage;
	}
}
