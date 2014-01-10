package classes;

import java.util.ArrayList;

public class ChampionStats {
	
	private int id;
	private String name;
	private ArrayList<ChampionStat> stats;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<ChampionStat> getStats() {
		return stats;
	}
	public void setStats(ArrayList<ChampionStat> stats) {
		this.stats = stats;
	}
}
