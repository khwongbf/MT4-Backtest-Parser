package com.metatradetools.backtest.models.summary.initial;

import java.beans.JavaBean;

/**
 *  Represents the environment applied in the strategy test.
 *  <p>This class represents the environment used in the strategy tester, which is applied to the test.</p>
 *  <p>
 *      An instance of this class should only be accessed by its owner, a {@link com.metatradetools.backtest.models.summary.BacktestSummary BacktestSummary} instance.
 *  </p>
 * @author Wong Kwan Ho
 * @version 1.0
 */
@JavaBean
public class Environment {
	/**
	 * The name of the expert advisor.
	 */
	private String expert;
	
	/**
	 * The name of the Metatrader 4 server.
	 */
	private String serverName;
	
	/**
	 * Returns the name of the expert advisor used in the strategy test
	 * @return the name of the expert advisor
	 * @see #expert
	 */
	public String getExpert () {
		return expert;
	}
	
	/**
	 * Sets the name of the expert advisor to the designated name
	 * @param expert the name that the expert advisor should be set to
	 * @see #expert
	 * @see #getExpert()
	 */
	public void setExpert (String expert) {
		this.expert = expert;
	}
	
	/**
	 * Returns the name of the Metatrader 4 server, usually provided by a forex broker.
	 * @return the name of the server used in strategy test
	 * @see #serverName
	 */
	public String getServerName () {
		return serverName;
	}
	
	/**
	 * Changes the name of the server to the designated name
	 * @param serverName the new name of the server
	 * @see #serverName
	 * @see #getServerName()
	 */
	public void setServerName (String serverName) {
		this.serverName = serverName;
	}
}
