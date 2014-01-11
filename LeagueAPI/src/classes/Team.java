package classes;

import java.util.ArrayList;

public class Team {

	private String createDate;
	private String lastGameDate;
	private String lastJoinDate;
	private String lastJoinedRankedTeamQueueDate;
	private ArrayList<MatchHistorySummary> matchHistory;
	private MessageOfDay messageOfDay;
	private String modifyDate;
	private String name;
	private Roster roster;
	private String secondLastJoinDate;
	private String status;
	private String tag;
	private TeamId teamId;
	private TeamStatSummary teamStatSummary;
	private String thirdLastJoinDate;
	private long timestamp;
	
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getLastGameDate() {
		return lastGameDate;
	}
	public void setLastGameDate(String lastGameDate) {
		this.lastGameDate = lastGameDate;
	}
	public String getLastJoinDate() {
		return lastJoinDate;
	}
	public void setLastJoinDate(String lastJoinDate) {
		this.lastJoinDate = lastJoinDate;
	}
	public String getLastJoinedRankedTeamQueueDate() {
		return lastJoinedRankedTeamQueueDate;
	}
	public void setLastJoinedRankedTeamQueueDate(
			String lastJoinedRankedTeamQueueDate) {
		this.lastJoinedRankedTeamQueueDate = lastJoinedRankedTeamQueueDate;
	}
	public ArrayList<MatchHistorySummary> getMatchHistory() {
		return matchHistory;
	}
	public void setMatchHistory(ArrayList<MatchHistorySummary> matchHistory) {
		this.matchHistory = matchHistory;
	}
	public MessageOfDay getMessageOfDay() {
		return messageOfDay;
	}
	public void setMessageOfDay(MessageOfDay messageOfDay) {
		this.messageOfDay = messageOfDay;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Roster getRoster() {
		return roster;
	}
	public void setRoster(Roster roster) {
		this.roster = roster;
	}
	public String getSecondLastJoinDate() {
		return secondLastJoinDate;
	}
	public void setSecondLastJoinDate(String secondLastJoinDate) {
		this.secondLastJoinDate = secondLastJoinDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public TeamId getTeamId() {
		return teamId;
	}
	public void setTeamId(TeamId teamId) {
		this.teamId = teamId;
	}
	public TeamStatSummary getTeamStatSummary() {
		return teamStatSummary;
	}
	public void setTeamStatSummary(TeamStatSummary teamStatSummary) {
		this.teamStatSummary = teamStatSummary;
	}
	public String getThirdLastJoinDate() {
		return thirdLastJoinDate;
	}
	public void setThirdLastJoinDate(String thirdLastJoinDate) {
		this.thirdLastJoinDate = thirdLastJoinDate;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}
