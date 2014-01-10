package classes;

public class TeamStatDetail {

	private int averageGamesPlayed;
	private int losses;
	private TeamId teamId;
	private String teamStatType;
	private int wins;
	
	public int getAverageGamesPlayed() {
		return averageGamesPlayed;
	}
	public void setAverageGamesPlayed(int averageGamesPlayed) {
		this.averageGamesPlayed = averageGamesPlayed;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public TeamId getTeamId() {
		return teamId;
	}
	public void setTeamId(TeamId teamId) {
		this.teamId = teamId;
	}
	public String getTeamStatType() {
		return teamStatType;
	}
	public void setTeamStatType(String teamStatType) {
		this.teamStatType = teamStatType;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
}
