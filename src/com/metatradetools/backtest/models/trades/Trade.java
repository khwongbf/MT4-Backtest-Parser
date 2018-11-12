package com.metatradetools.backtest.models.trades;

import org.jetbrains.annotations.Nullable;

import java.beans.JavaBean;
import java.util.Date;

@JavaBean
public class Trade {
	private int id;
	private Date time;
	private String type;
	private int order_id;
	private double size;
	private double price;
	
	@Nullable
	private Double stopLoss;
	
	@Nullable
	private Double takeProfit;
	
	@Nullable
	private Double profit;
	
	@Nullable
	private Double balance;
	
	public int getId () {
		return id;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public Date getTime () {
		return time;
	}
	
	public void setTime (Date time) {
		this.time = time;
	}
	
	public String getType () {
		return type;
	}
	
	public void setType (String type) {
		this.type = type;
	}
	
	public int getOrder_id () {
		return order_id;
	}
	
	public void setOrder_id (int order_id) {
		this.order_id = order_id;
	}
	
	public double getSize () {
		return size;
	}
	
	public void setSize (double size) {
		this.size = size;
	}
	
	public double getPrice () {
		return price;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public Double getStopLoss () {
		return stopLoss;
	}
	
	public void setStopLoss (@Nullable Double stopLoss) {
		this.stopLoss = stopLoss;
	}
	
	public Double getTakeProfit () {
		return takeProfit;
	}
	
	public void setTakeProfit (@Nullable Double takeProfit) {
		this.takeProfit = takeProfit;
	}
	
	public Double getProfit () {
		return profit;
	}
	
	public void setProfit (@Nullable Double profit) {
		this.profit = profit;
	}
	
	public Double getBalance () {
		return balance;
	}
	
	public void setBalance (@Nullable Double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString () {
		return "Trade{" +
				"id=" + id +
				", time=" + time +
				", type='" + type + '\'' +
				", order_id=" + order_id +
				", size=" + size +
				", price=" + price +
				", stopLoss=" + stopLoss +
				", takeProfit=" + takeProfit +
				", profit=" + profit +
				", balance=" + balance +
				'}';
	}
}
