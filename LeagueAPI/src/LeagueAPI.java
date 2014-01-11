import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

import leagueAPIExceptions.LeagueAPIException;
import classes.ChampionList;
import classes.League;
import classes.MasteryPages;
import classes.PlayerStatsSummaryList;
import classes.RankedStats;
import classes.RecentGames;
import classes.RunePages;
import classes.Summoner;
import classes.Team;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LeagueAPI {

    public enum Region {
        EUW, EUNE, NA;
    }

    public enum Season {
        SEASON3, SEASON4;
    }
	
	private String apiKey;
	private static String URL_V1;
	private static String URL_V2;
	private static String URL_V3;
	
	public LeagueAPI(String apiKey, Region region) {
		this.apiKey = apiKey;
		LeagueAPI.URL_V1 = "https://prod.api.pvp.net/api/lol/" + region.name().toLowerCase() + "/v1.1/";
		LeagueAPI.URL_V2 = "http://prod.api.pvp.net/api/" + region.name().toLowerCase() + "/v2.1/";
		LeagueAPI.URL_V3 = "http://prod.api.pvp.net/api/lol/" + region.name().toLowerCase() + "/v1.3/";
	}
	
	/**
	 * Retrieves a summoner object of the given summoner name
	 * @param summonerName the summoner's name
	 * @return a summoner
	 */
	public Summoner getSummoner(String summonerName) {
		String jsonString = LeagueAPI.request(URL_V1 + "summoner/by-name/" + summonerName + "?api_key=" + this.apiKey);
		Summoner summoner = new Gson().fromJson(jsonString, Summoner.class);
		
		return summoner;
	}
	
	/**
	 * Retrives a summoner object of the given summoner id
	 * @param summonerId the summoner's id
	 * @return a summoner
	 */
	public Summoner getSummoner(Long summonerId) {
		String jsonString = LeagueAPI.request(URL_V1 + "summoner/" + summonerId + "?api_key=" + this.apiKey);
		Summoner summoner = new Gson().fromJson(jsonString, Summoner.class);
		
		return summoner;
	}
	
	/**
	 * Retrieves a list of all champions
	 * @return a ChampionList
	 */
	public ChampionList getChampionList() {
		String jsonString = LeagueAPI.request(URL_V1 + "champion?api_key=" + this.apiKey);
		ChampionList championList = new Gson().fromJson(jsonString, ChampionList.class);
		
		return championList;
	}
	
	/**
	 * Retrieves a list of a recent games of the given summoner id
	 * @param summonerId the summoner's id
	 * @return a RecentGames
	 */
    public RecentGames getRecentGames(Long summonerId) {
        String jsonString = LeagueAPI.request(URL_V3 + "game/by-summoner/" + summonerId + "/recent?api_key=" + this.apiKey);
        RecentGames recentGames = new Gson().fromJson(jsonString, RecentGames.class);

        return recentGames;
    }	
	
	/**
	 * Retrieves leagues data for a given summoner id
	 * @param summonerId the summoner's id
	 * @return a A map with the league name and the related League object
	 */
	public Map<String, League> getLeagues(Long summonerId) {
         String jsonString = LeagueAPI.request(URL_V2 + "league/by-summoner/" + summonerId + "?api_key=" + this.apiKey);

         Map<String, League> decoded = new Gson().fromJson(jsonString, new TypeToken<Map<String, League>>() {}.getType());

         return decoded;
	}
	
	/**
	 * Retrieves player stats of summoner with given summonerId and season
	 * @param summonerId the summoner's id
	 * @param season the specified season
	 * @return a PlayerStatsSummary
	 */
    public PlayerStatsSummaryList getPlayerStats(Long summonerId, Season season) {
        String jsonString = LeagueAPI.request(URL_V1 + "stats/by-summoner/" + summonerId + "/summary?season=" + season + "&api_key="
                        + this.apiKey);
        PlayerStatsSummaryList playerStatsSummaryList = new Gson().fromJson(jsonString, PlayerStatsSummaryList.class);

        return playerStatsSummaryList;
    }
    
    /**
     * Retrieves ranked stats of a summoner with given summonerId and season
     * @param summonerId the summoner's id
     * @param season the specified season
     * @return a RankedStats
     */
    public RankedStats getRankedStats(Long summonerId, Season season) {
        String jsonString = LeagueAPI
                        .request(URL_V1 + "stats/by-summoner/" + summonerId + "/ranked?season=" + season + "&api_key=" + this.apiKey);
        RankedStats rankedStats = new Gson().fromJson(jsonString, RankedStats.class);

        return rankedStats;
    }
    
    /**
     * Retrieves teams of a summoner of a given summonerId
     * @param summonerId the summoner's id
     * @return an ArrayList of Team
     */
    public ArrayList<Team> getTeams(Long summonerId) {
        String jsonString = LeagueAPI.request(URL_V2 + "team/by-summoner/" + summonerId + "?api_key=" + this.apiKey);

        ArrayList<Team> teams = new Gson().fromJson(jsonString, new TypeToken<ArrayList<Team>>() {}.getType());

        return teams;
    }
    
    /**
     * Retrieves the mastery pages of a summoner of the given summonerId
     * @param summonerId the summoner's id
     * @return a MasteryPages
     */
    public MasteryPages getMasteryPages(Long summonerId) {
        String jsonString = LeagueAPI.request(URL_V1 + "summoner/" + summonerId + "/masteries?api_key=" + this.apiKey);
        MasteryPages masteryPages = new Gson().fromJson(jsonString, MasteryPages.class);

        return masteryPages;
    }
    
    /**
     * Retrieves the rune pages of a summoner of the given summonerId
     * @param summonerId the summoner's id
     * @return a RunePages
     */
    public RunePages getRunePages(Long summonerId) {
        String jsonString = LeagueAPI.request(URL_V1 + "summoner/" + summonerId + "/runes?api_key=" + this.apiKey);
        RunePages runePages = new Gson().fromJson(jsonString, RunePages.class);

        return runePages;
    }

    /**
     * Returns a JSON string from the given URL
     * @param url the URL
     * @return a JSON string
     */
    public static String request(String url) {
        HttpURLConnection connection = null;
        StringBuilder builder = null;

        try {
                URL urlIn = new URL(url);
                connection = (HttpURLConnection) urlIn.openConnection();
                String line;
                builder = new StringBuilder();

                InputStream inputStream = null;

                int code = connection.getResponseCode();
                switch (code) {
                case LeagueAPIException.ERROR_API_KEY_LIMIT:
                        throw new LeagueAPIException(LeagueAPIException.ERROR_API_KEY_LIMIT);
                case LeagueAPIException.ERROR_API_KEY_WRONG:
                        throw new LeagueAPIException(LeagueAPIException.ERROR_API_KEY_WRONG);
                }

                try {
                        inputStream = connection.getInputStream();
                } catch (FileNotFoundException e) {
                        throw new LeagueAPIException("Error 404: The API couldn't find a match to your parameters.");
                }
                if (inputStream == null) {
                        throw new LeagueAPIException("Error: Empty response.");
                }

                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                while ((line = reader.readLine()) != null) {
                        builder.append(line);
                }
        } catch (IOException e) {
                e.printStackTrace();
        } catch (LeagueAPIException e) {
                e.printStackTrace();
        }

        return builder.toString();
    }
}
