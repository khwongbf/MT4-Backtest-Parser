package com.metatradetools.backtest.parsers;

import com.metatradetools.backtest.models.Backtest;
import com.metatradetools.backtest.models.trades.Trade;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *  A parser service that provides parsing methods between various formats and the {@link Backtest} object.
 *
 * @author Wong Kwan Ho
 * @version 1.0
 */

public class BacktestParser {
	
	private static final String STYLE_EXPERT = "font: 16pt Times New Roman";
	private static final String STYLE_SERVER_NAME = "font: 10pt Times New Roman";
	
	/**
	 * Parses a given .htm file to a new {@link Backtest} object.
	 * <p>
	 *       This method treats the .htm file as a DOM tree, and inputs all the fields given by the file to the {@link Backtest} object.
	 * </p>
	 * <p>
	 *     Cases that will return null instead:
	 *     <ol>
	 *         <li>The file is <b>NOT</b> generated by Strategy Tester in Metatrader 4.</li>
	 *         <li>The file was generated into human languages <b>OTHER</b> than English.</li>
	 *         <li>The file does <b>NOT</b> use the UTF-8 charset.</li>
	 *      </ol>
	 * </p>
	 * @param file the .htm file that is to be parsed
	 * @return a new {@link Backtest} object that was parsed from the given file, or null if the file is incorrect.
	 */
	public static Backtest parseFileToBacktest(File file) {
		Backtest backtest = new Backtest();
		try {
			Document document = Jsoup.parse(file, "UTF-8");
			
			// Parse Summary
			Elements selectedElements = document.getElementsByTag("div");
			String style;
			String retrievedString;
			for (Element element : selectedElements) {
				if (element.hasAttr("style")) {
					style = element.attr("style");
					if (style.contains(STYLE_EXPERT.subSequence(0, STYLE_EXPERT.length()))) {
						retrievedString = element.text().trim();
						backtest.getSummary().getEnvironment().setExpert(retrievedString);
					} else if (style.contains(STYLE_SERVER_NAME.subSequence(0, STYLE_SERVER_NAME.length()))) {
						retrievedString = element.text().trim();
						backtest.getSummary().getEnvironment().setServerName(retrievedString.substring(0, retrievedString.indexOf("(")).trim());
					}
				}
			}
			selectedElements = document.getElementsByTag("td");
			for (var element : selectedElements) {
				// Part 1: backtest summary
				if (element.hasText() && element.nextElementSibling() != null && element.nextElementSibling().hasText()) {
					// Temporarily stores a string retrieved in a element to set fields in the object
					retrievedString = element.nextElementSibling().text().trim();
					switch (element.text().trim()) {
						case "Symbol":
							backtest.getSummary().getInputs().setSymbol(retrievedString.substring(0, 6));
							break;
						case "Period":
							String timeframe = retrievedString.substring(retrievedString.indexOf("(") + 1, retrievedString.indexOf(")")).trim();
							String dates = retrievedString.substring(retrievedString.indexOf(")") + 1, retrievedString.lastIndexOf("(")).trim();
							String startDateInStr = dates.split("-")[0].trim();
							SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm");
							Date startDate = dateFormat.parse(startDateInStr);
							String endDateInStr = dates.split("-")[1].trim();
							Date endDate = dateFormat.parse(endDateInStr);
							
							backtest.getSummary().getInputs().setTimeframe(timeframe);
							backtest.getSummary().getInputs().getStartDate().setTime(startDate);
							backtest.getSummary().getInputs().getEndDate().setTime(endDate);
							break;
						case "Model":
							backtest.getSummary().getInputs().setModel(retrievedString.substring(0, retrievedString.indexOf("(")));
							break;
						case "Parameters":
							backtest.getSummary().getInputs().setParameters(retrievedString);
							break;
						case "Bars in test":
							backtest.getSummary().getModelling().setBarsInTest(Integer.parseInt(retrievedString));
							break;
						case "Ticks modelled":
							backtest.getSummary().getModelling().setTicksModelled(Integer.parseInt(retrievedString));
							break;
						case "Modelling quality":
							backtest.getSummary().getModelling().setModellingQuality(Double.parseDouble(retrievedString.replace("%", "")));
							break;
						case "Mismatched charts errors":
							backtest.getSummary().getModelling().setMismatchedChartErrors(Integer.parseInt(retrievedString));
							break;
						case "Initial deposit":
							backtest.getSummary().getInputs().setInitialDeposit(Double.parseDouble(retrievedString));
							break;
						case "Spread":
							backtest.getSummary().getInputs().setSpread(retrievedString);
							break;
						case "Total net profit":
							backtest.getSummary().getResult().getProfitAndLoss().setTotalNetProfit(Double.parseDouble(retrievedString));
							break;
						case "Gross profit":
							backtest.getSummary().getResult().getProfitAndLoss().setGrossProfit(Double.parseDouble(retrievedString));
							break;
						case "Gross loss":
							backtest.getSummary().getResult().getProfitAndLoss().setGrossLoss(Double.parseDouble(retrievedString));
							break;
						case "Profit factor":
							backtest.getSummary().getResult().getProfitAndLoss().setProfitFactor(Double.parseDouble(retrievedString));
							break;
						case "Expected payoff":
							backtest.getSummary().getResult().getProfitAndLoss().setExpectedPayoff(Double.parseDouble(retrievedString));
							break;
						case "Absolute drawdown":
							backtest.getSummary().getResult().getRisks().setAbsoluteDrawdown(Double.parseDouble(retrievedString));
							break;
						case "Maximal drawdown":
							backtest.getSummary().getResult().getRisks().setMaximalDrawdownAbsolute(Double.parseDouble(retrievedString.substring(0, retrievedString.indexOf("(")).trim()));
							backtest.getSummary().getResult().getRisks().setMaximalDrawdownPercentage(Double.parseDouble(retrievedString.substring(retrievedString.indexOf("(") + 1, retrievedString.indexOf("%")).trim()));
							break;
						case "Relative drawdown":
							backtest.getSummary().getResult().getRisks().setRelativeDrawdownPercentage(Double.parseDouble(retrievedString.substring(0, retrievedString.indexOf("%")).trim()));
							backtest.getSummary().getResult().getRisks().setRelativeDrawdownAbsolute(Double.parseDouble(retrievedString.substring(retrievedString.indexOf("(") + 1, retrievedString.indexOf(")")).trim()));
							break;
						case "Total trades":
							backtest.getSummary().getResult().getTradeSummary().setTotalTrades(Integer.parseInt(retrievedString));
							break;
						case "Short positions (won %)":
							backtest.getSummary().getResult().getTradeSummary().setShortPositions(Integer.parseInt(retrievedString.substring(0, retrievedString.indexOf("(")).trim()));
							backtest.getSummary().getResult().getTradeSummary().setShortPositionsWinRate(Double.parseDouble(retrievedString.substring(retrievedString.indexOf("(") + 1, retrievedString.indexOf("%")).trim()));
							break;
						case "Long positions (won %)":
							backtest.getSummary().getResult().getTradeSummary().setLongPositions(Integer.parseInt(retrievedString.substring(0, retrievedString.indexOf("(")).trim()));
							backtest.getSummary().getResult().getTradeSummary().setLongPositionsWinRate(Double.parseDouble(retrievedString.substring(retrievedString.indexOf("(") + 1, retrievedString.indexOf("%")).trim()));
							break;
						case "Profit trades (% of total)":
							backtest.getSummary().getResult().getTradeSummary().setProfitTrades(Integer.parseInt(retrievedString.substring(0, retrievedString.indexOf("(")).trim()));
							backtest.getSummary().getResult().getTradeSummary().setWinRate(Double.parseDouble(retrievedString.substring(retrievedString.indexOf("(") + 1, retrievedString.indexOf("%")).trim()));
							break;
						case "Loss trades (% of total)":
							backtest.getSummary().getResult().getTradeSummary().setLossTrades(Integer.parseInt(retrievedString.substring(0, retrievedString.indexOf("(")).trim()));
							backtest.getSummary().getResult().getTradeSummary().setLossRate(Double.parseDouble(retrievedString.substring(retrievedString.indexOf("(") + 1, retrievedString.indexOf("%")).trim()));
							break;
						case "profit trade":
							if (element.parent().child(0).text().trim().equals("Largest")) {
								backtest.getSummary().getResult().getMiscellaneous().getLargestByMoney().setProfitTrade(Double.parseDouble(retrievedString));
							} else if (element.parent().child(0).text().trim().equals("Average")) {
								backtest.getSummary().getResult().getMiscellaneous().getAveragesByMoney().setProfitTrade(Double.parseDouble(retrievedString));
							}
							break;
						case "loss trade":
							if (element.parent().child(0).text().trim().equals("Largest")) {
								backtest.getSummary().getResult().getMiscellaneous().getLargestByMoney().setLossTrade(Double.parseDouble(retrievedString));
							} else if (element.parent().child(0).text().trim().equals("Average")) {
								backtest.getSummary().getResult().getMiscellaneous().getAveragesByMoney().setLossTrade(Double.parseDouble(retrievedString));
							}
							break;
						case "consecutive wins (profit in money)":
							backtest.getSummary().getResult().getMiscellaneous().getMaximumsByCount().setConsecutiveWins(Integer.parseInt(retrievedString.substring(0, retrievedString.indexOf("(")).trim()));
							backtest.getSummary().getResult().getMiscellaneous().getMaximumsByCount().setConsecutiveProfitInMoney(Double.parseDouble(retrievedString.substring(retrievedString.indexOf("(")+1 , retrievedString.indexOf(")")).trim()));
							break;
						case "consecutive losses (loss in money)":
							backtest.getSummary().getResult().getMiscellaneous().getMaximumsByCount().setConsecutiveLosses(Integer.parseInt(retrievedString.substring(0, retrievedString.indexOf("(")).trim()));
							backtest.getSummary().getResult().getMiscellaneous().getMaximumsByCount().setConsecutiveLossInMoney(Double.parseDouble(retrievedString.substring(retrievedString.indexOf("(")+1 , retrievedString.indexOf(")")).trim()));
							break;
						case "consecutive profit (count of wins)":
							backtest.getSummary().getResult().getMiscellaneous().getMaximumsByMoney().setConsecutiveProfit(Double.parseDouble(retrievedString.substring(0, retrievedString.indexOf("(")).trim()));
							backtest.getSummary().getResult().getMiscellaneous().getMaximumsByMoney().setConsecutiveCountOfWins(Integer.parseInt(retrievedString.substring(retrievedString.indexOf("(")+1 , retrievedString.indexOf(")")).trim()));
							break;
						case "consecutive loss (count of losses)":
							backtest.getSummary().getResult().getMiscellaneous().getMaximumsByMoney().setConsecutiveLoss(Double.parseDouble(retrievedString.substring(0, retrievedString.indexOf("(")).trim()));
							backtest.getSummary().getResult().getMiscellaneous().getMaximumsByMoney().setConsecutiveCountOfLosses(Integer.parseInt(retrievedString.substring(retrievedString.indexOf("(")+1 , retrievedString.indexOf(")")).trim()));
							break;
						case "consecutive wins":
							backtest.getSummary().getResult().getMiscellaneous().getAveragesByCount().setConsecutiveWins(Integer.parseInt(retrievedString));
							break;
						case "consecutive losses":
							backtest.getSummary().getResult().getMiscellaneous().getAveragesByCount().setConsecutiveLosses(Integer.parseInt(retrievedString));
							break;
					}if (element == element.lastElementSibling() && element.parent() == element.parent().lastElementSibling()){
						break;
					}
				}
			}
			
			// parse Trades
			selectedElements = document.getElementsByTag("table");
			var tradeTable = selectedElements.last();
			selectedElements = tradeTable.children().first().children();
			for (var currentRow: selectedElements){
				if (currentRow == selectedElements.first()){
				} else {
					var length = currentRow.childNodeSize();
					Trade trade = new Trade();
					for (var i = 0; i < length; i++){
						var processingString = currentRow.child(i).text().trim();
						switch (i){
							case 0:
								trade.setId(Integer.parseInt(processingString));
								break;
							case 1:
								SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm");
								trade.setTime(simpleDateFormat.parse(processingString));
								break;
							case 2:
								trade.setType(processingString);
								break;
							case 3:
								trade.setOrder_id(Integer.parseInt(processingString));
								break;
							case 4:
								trade.setSize(Double.parseDouble(processingString));
								break;
							case 5:
								trade.setPrice(Double.parseDouble(processingString));
								break;
							case 6:
								if (processingString.equals("0.00000")){
									trade.setStopLoss(null);
								} else{
									trade.setStopLoss(Double.valueOf(processingString));
								}
								break;
							case 7:
								if (processingString.equals("0.00000")){
									trade.setTakeProfit(null);
								}else{
									trade.setTakeProfit(Double.valueOf(processingString));
								}
								break;
							case 8:
								if (currentRow.child(i).hasAttr("colspan")){
									trade.setProfit(null);
									trade.setBalance(null);
								}else{
									trade.setProfit(Double.valueOf(processingString));
								}
								break;
							case 9:
								trade.setBalance(Double.valueOf(processingString));
								break;
						}
					}
					System.out.println("Adding trade #" + trade.getId());
					backtest.getTrades().add(trade);
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Invalid Date Format Detected!!!");
			backtest = null;
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IO Exception thrown");
			backtest = null;
		}
		return backtest;
	}
}
