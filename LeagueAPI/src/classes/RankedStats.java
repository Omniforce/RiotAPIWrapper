package classes;

import java.util.ArrayList;

public class RankedStats {

	private ArrayList<ChampionStats> champions;
	private long modifyDate;
	private String modifyDateStr;
	private long summonerId;
	
	public ArrayList<ChampionStats> getChampions() {
		return champions;
	}
	public void setChampions(ArrayList<ChampionStats> champions) {
		this.champions = champions;
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
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
}
