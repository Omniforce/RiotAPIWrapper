package classes;

import java.util.Date;

public class Summoner {

	private long id;
	private String name;
	private int profileIconId;
	private long revisionDate;
	private String revisionDateStr;
	private long summonerLevel;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProfileIconId() {
		return profileIconId;
	}
	public void setProfileIconId(int profileIconId) {
		this.profileIconId = profileIconId;
	}
	public long getRevisionDate() {
		return revisionDate;
	}
	public void setRevisionDate(long revisionDate) {
		this.revisionDate = revisionDate;
	}
	public String getRevisionDateStr() {
		return revisionDateStr;
	}
	public void setRevisionDateStr(String revisionDateStr) {
		this.revisionDateStr = revisionDateStr;
	}
	public long getSummonerLevel() {
		return summonerLevel;
	}
	public void setSummonerLevel(long summonerLevel) {
		this.summonerLevel = summonerLevel;
	}
}
