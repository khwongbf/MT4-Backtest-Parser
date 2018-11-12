package com.metatradetools.backtest.models.summary.result.detail;

import com.metatradetools.backtest.models.summary.result.detail.miscellaneous.*;

public class Miscellaneous {
	private final AveragesByCount averagesByCount = new AveragesByCount();
	private final AveragesByMoney averagesByMoney = new AveragesByMoney();
	private final LargestByMoney largestByMoney = new LargestByMoney();
	private final MaximumsByCount maximumsByCount = new MaximumsByCount();
	private final MaximumsByMoney maximumsByMoney = new MaximumsByMoney();
	
	public AveragesByCount getAveragesByCount () {
		return averagesByCount;
	}
	
	public AveragesByMoney getAveragesByMoney () {
		return averagesByMoney;
	}
	
	public LargestByMoney getLargestByMoney () {
		return largestByMoney;
	}
	
	public MaximumsByCount getMaximumsByCount () {
		return maximumsByCount;
	}
	
	public MaximumsByMoney getMaximumsByMoney () {
		return maximumsByMoney;
	}
	
}
