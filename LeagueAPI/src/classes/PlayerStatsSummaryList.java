package classes;

import java.util.ArrayList;

public class PlayerStatsSummaryList {

	private ArrayList<PlayerStatsSummary> playerStatSummaries;
	private long summonerId;
	
	public ArrayList<PlayerStatsSummary> getPlayerStatSummaries() {
		return playerStatSummaries;
	}
	public void setPlayerStatSummaries(
			ArrayList<PlayerStatsSummary> playerStatSummaries) {
		this.playerStatSummaries = playerStatSummaries;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
}
