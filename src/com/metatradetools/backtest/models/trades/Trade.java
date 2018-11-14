package com.metatradetools.backtest.models.trades;

import org.jetbrains.annotations.Nullable;

import java.beans.JavaBean;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 *  Represents a trade in the strategy tester report.
 *  <p>
 *      This bean represents a single execution of trade in the strategy tester report, which is a row in the last table of the report.
 *  </p>
 *
 * @author Wong Kwan Ho
 * @version 1.0
 */
@JavaBean
public class Trade {
	/**
	 * The numeric sequence of the execution.
	 */
	private int id;
	
	/**
	 * The date and time that the execution occurs.
	 */
	private ZonedDateTime time;
	
	/**
	 * The type of execution.
	 */
	private String type;
	
	/**
	 * The order ID that the execution was concerned of.
	 */
	private int order_id;
	
	/**
	 * The size of the order, in number of lots.
	 */
	private double size;
	
	/**
	 * The price of the underlying instrument at the moment the execution took place.
	 */
	private double price;
	
	/**
	 * The stop loss price appointed by the execution.
	 */
	@Nullable
	private Double stopLoss;
	
	/**
	 * The take profit price appointed by the execution.
	 */
	@Nullable
	private Double takeProfit;
	
	/**
	 * The profit made for the current execution, if the type of execution is SL,TP, close or close at stop.
	 */
	@Nullable
	private Double profit;
	
	/**
	 * The balance of the account after adding the profit for the current execution, null if {@link this#profit} is null.
	 */
	@Nullable
	private Double balance;
	
	/**
	 * Returns the numeric sequence of this execution of trade.
	 * @return the numeric sequence.
	 * @see #id
	 */
	public int getId () {
		return id;
	}
	
	/**
	 * Sets the numeric sequence of the execution to the specified id.
	 * @param id The sequence number that is to be set.
	 * @see #id
	 * @see #getId()
	 */
	public void setId (int id) {
		this.id = id;
	}
	
	/**
	 * Returns the date and time where the execution occurs.
	 * @return the date and time the execution took place
	 * @see #time
	 */
	public ZonedDateTime getTime () {
		return time;
	}
	
	/**
	 * Sets the date and time that the execution took place to the specified date and time.
	 * @param time The date and time that is to be set.
	 * @see #time
	 * @see #getTime()
	 */
	public void setTime (ZonedDateTime time) {
		this.time = time;
	}
	
	/**
	 * Returns the type of execution towards the concerned trade.
	 * <p>
	 *     This method obtains the type of execution of a trade, which can only be one of the following:
	 *     <ul>
	 *         <li>buy</li>
	 *         <li>sell</li>
	 *         <li>buy limit</li>
	 *         <li>sell limit</li>
	 *         <li>buy stop</li>
	 *         <li>sell stop</li>
	 *         <li>modify</li>
	 *         <li>cancel</li>
	 *         <li>S/L</li>
	 *         <li>T/P</li>
	 *         <li>close</li>
	 *         <li>close at stop</li>
	 *     </ul>
	 * </p>
	 * @return the type of the execution.
	 * @see #type
	 */
	public String getType () {
		return type;
	}
	
	/**
	 * Set the type of the concerned execution to be the designated type.
	 * @param type the designated type of execution
	 * @see #type
	 * @see #getType()
	 */
	public void setType (String type) {
		this.type = type;
	}
	
	/**
	 * Returns the identifier of the concerned trade of this execution.
	 * @return the order ID of the trade
	 * @see #order_id
	 */
	public int getOrder_id () {
		return order_id;
	}
	
	/**
	 * Sets the ID of the concerned trade of this execution to the designated integer.
	 * @param order_id The integer identifier that is to be set
	 * @see #order_id
	 */
	public void setOrder_id (int order_id) {
		this.order_id = order_id;
	}
	
	/**
	 * Returns the size of the trade, in number of lots.
	 * <p>
	 *     This method returns the size of a trade in the number of lots. The size of a lot depends on the underlying instrument.
	 * </p>
	 * <p>
	 *     Typically, a lot in currency trading refers to 100,000 units of the base currency, such as 100,000 EUR in EUR/USD and 100,000 USD in USD/JPY.
	 * </p>
	 * @return lot size of the concerned trade
	 */
	public double getSize () {
		return size;
	}
	
	/**
	 * Set the size of the trade to be the designated size, in number of lots.
	 * @param size The number of lots that the trade should be set to
	 * @see #size
	 * @see #getSize()
	 */
	public void setSize (double size) {
		this.size = size;
	}
	
	/**
	 * Returns the price at the moment the execution occurs.
	 * @return the price when the execution took place
	 * @see #price
	 */
	public double getPrice () {
		return price;
	}
	
	/**
	 * Sets the price when the execution took place to be the designated price.
	 * @param price the price that is to be set when the execution took place
	 * @see #price
	 * @see #getPrice()
	 */
	public void setPrice (double price) {
		this.price = price;
	}
	
	/**
	 * Returns the stop loss price of the concerned trade.
	 * @return the stop loss price of the underlying trade as a {@link Double} object, null if a stop loss is not set
	 * @see #stopLoss
	 */
	public Double getStopLoss () {
		return stopLoss;
	}
	
	/**
	 * Sets the stop loss price of the underlying trade to the designated {@link Double} object that contains the value.
	 * @param stopLoss the stop loss price that is wrapped in {@link Double}
	 * @see #stopLoss
	 * @see #getStopLoss()
	 */
	public void setStopLoss (@Nullable Double stopLoss) {
		this.stopLoss = stopLoss;
	}
	
	/**
	 * Returns the take profit price of the concerned trade.
	 * @return the take profit price of the underlying trade as a {@link Double} object, null if a take profit is not set.
	 * @see #takeProfit
	 */
	public Double getTakeProfit () {
		return takeProfit;
	}
	
	/**
	 * Sets the take profit price of the underlying trade to the designated {@link Double} object that contains the value.
	 * @param takeProfit the take profit price that is wrapped in {@link Double}
	 * @see #takeProfit
	 * @see #getTakeProfit()
	 */
	public void setTakeProfit (@Nullable Double takeProfit) {
		this.takeProfit = takeProfit;
	}
	
	/**
	 * Returns the profit (or loss if it is negative) of the execution, as a {@link Double} object.
	 * @return the profit or loss of the execution, null if there is no profit or loss
	 * @see #profit
	 */
	public Double getProfit () {
		return profit;
	}
	
	/**
	 * Sets the profit or loss of the execution to the {@link Double} object that contains the value.
	 * @param profit the profit or loss of the trade, wrapped in {@link Double}
	 * @see #profit
	 * @see #getProfit()
	 */
	public void setProfit (@Nullable Double profit) {
		this.profit = profit;
	}
	
	/**
	 * Returns the account balance after the current execution, wrapped in a {@link Double} object.
	 * @return the account balance after the current execution, null if there is no profit or loss in this execution
	 * @see #profit
	 * @see #balance
	 * @see #getProfit()
	 * @see #getBalance()
	 */
	public Double getBalance () {
		return balance;
	}
	
	/**
	 * Sets the account balance after the current execution to the designated value, wrapped in a {@link Double} object.
	 * @param balance the account balance that is to be set to, wrapped in a {@link Double} object
	 * @see #balance
	 * @see #getBalance()
	 */
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
