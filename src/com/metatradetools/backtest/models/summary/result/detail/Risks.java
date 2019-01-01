package com.metatradetools.backtest.models.summary.result.detail;

import java.math.BigDecimal;

public class Risks {
	private BigDecimal absoluteDrawdown;
	private BigDecimal maximalDrawdownAbsolute;
	private BigDecimal maximalDrawdownPercentage;
	private BigDecimal relativeDrawdownAbsolute;
	private BigDecimal relativeDrawdownPercentage;
	
	public BigDecimal getAbsoluteDrawdown () {
		return absoluteDrawdown;
	}
	
	public void setAbsoluteDrawdown (BigDecimal absoluteDrawdown) {
		this.absoluteDrawdown = absoluteDrawdown;
	}
	
	public BigDecimal getMaximalDrawdownAbsolute () {
		return maximalDrawdownAbsolute;
	}
	
	public void setMaximalDrawdownAbsolute (BigDecimal maximalDrawdownAbsolute) {
		this.maximalDrawdownAbsolute = maximalDrawdownAbsolute;
	}
	
	public BigDecimal getMaximalDrawdownPercentage () {
		return maximalDrawdownPercentage;
	}
	
	public void setMaximalDrawdownPercentage (BigDecimal maximalDrawdownPercentage) {
		this.maximalDrawdownPercentage = maximalDrawdownPercentage;
	}
	
	public BigDecimal getRelativeDrawdownAbsolute () {
		return relativeDrawdownAbsolute;
	}
	
	public void setRelativeDrawdownAbsolute (BigDecimal relativeDrawdownAbsolute) {
		this.relativeDrawdownAbsolute = relativeDrawdownAbsolute;
	}
	
	public BigDecimal getRelativeDrawdownPercentage () {
		return relativeDrawdownPercentage;
	}
	
	public void setRelativeDrawdownPercentage (BigDecimal relativeDrawdownPercentage) {
		this.relativeDrawdownPercentage = relativeDrawdownPercentage;
	}
}
