package com.metatradetools.backtest.models.summary.initial;

import java.beans.JavaBean;

@JavaBean
public class Environment {
	private String expert;
	private String serverName;
	
	public String getExpert () {
		return expert;
	}
	
	public void setExpert (String expert) {
		this.expert = expert;
	}
	
	public String getServerName () {
		return serverName;
	}
	
	public void setServerName (String serverName) {
		this.serverName = serverName;
	}
}
