package com.metatradetools.backtest.models.summary.initial;

import java.beans.JavaBean;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

@JavaBean
public class Inputs {
	private String symbol;
	private String timeframe;
	private GregorianCalendar startDate = new GregorianCalendar(new SimpleTimeZone(3600000*2, "ForexUS", Calendar.MARCH, 2, Calendar.SUNDAY, 0, Calendar.NOVEMBER, 1, Calendar.SUNDAY, 3600000));
	private GregorianCalendar endDate = new GregorianCalendar(new SimpleTimeZone(3600000*2, "ForexUS", Calendar.MARCH, 2, Calendar.SUNDAY, 0, Calendar.NOVEMBER, 1, Calendar.SUNDAY, 3600000));
	private String model;
	private String parameters;
	private double initialDeposit;
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
