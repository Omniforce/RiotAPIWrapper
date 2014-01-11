package classes;

import java.util.ArrayList;

public class PlayerStatsSummary {

	private ArrayList<AggregatedStat> aggregatedStats;
	private int losses;
	private long modifyDate;
	private String modifyDateStr;
	private String playerStatSummaryType;
	private int wins;
	
	public ArrayList<AggregatedStat> getAggregatedStats() {
		return aggregatedStats;
	}
	public void setAggregatedStats(ArrayList<AggregatedStat> aggregatedStats) {
		this.aggregatedStats = aggregatedStats;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public long getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(long modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getModifyDateStr() {
		return modifyDateStr;
	}
	public void setModifyDateStr(String modifyDateStr) {
		this.modifyDateStr = modifyDateStr;
	}
	public String getPlayerStatSummaryType() {
		return playerStatSummaryType;
	}
	public void setPlayerStatSummaryType(String playerStatSummaryType) {
		this.playerStatSummaryType = playerStatSummaryType;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
}
