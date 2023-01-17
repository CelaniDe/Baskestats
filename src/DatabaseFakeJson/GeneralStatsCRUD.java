package DatabaseFakeJson;

import model.GeneralStats;
import model.Team;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GeneralStatsCRUD
{
    private static String GENERAL_STATS_JSON_FILE_PATH = "src/json_data/leagueStanding.json";
    private static String PLAYER_STATS_JSON_FILE_PATH = "src/json_data/players_stats.json";

    //Gets an int as team_id and returns all stats of the team with that id
    public GeneralStats getGeneralStatsForTeam(int team_id)
    {
        JSONParser parser = new JSONParser();
        try
        {
            Object obj = parser.parse(new FileReader(GENERAL_STATS_JSON_FILE_PATH));
            JSONArray teamList = (JSONArray) obj;

            for(int i = 0; i < teamList.size(); i++)
            {
                JSONObject generalStatsObject = (JSONObject) teamList.get(i);
                int id = (int)((long) generalStatsObject.get("team_id"));
                if(id == team_id)
                {
                    int number_of_matches = (int)((long) generalStatsObject.get("number_of_matches"));
                    int wins = (int)((long) generalStatsObject.get("wins"));
                    int loses = (int)((long) generalStatsObject.get("loses"));
                    int points = (int)((long) generalStatsObject.get("points"));
                    return new GeneralStats(id,number_of_matches,wins,loses,points);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public List<GeneralStats> getGeneralStatsForAllTeams()
    {
        JSONParser parser = new JSONParser();
        List<GeneralStats> listaToReturn = new ArrayList<>();
        try
        {
            Object obj = parser.parse(new FileReader(GENERAL_STATS_JSON_FILE_PATH));
            JSONArray teamList = (JSONArray) obj;

            for(int i = 0; i < teamList.size(); i++)
            {
                JSONObject generalStatsObject = (JSONObject) teamList.get(i);
                int id = (int)((long) generalStatsObject.get("team_id"));
                int number_of_matches = (int)((long) generalStatsObject.get("number_of_matches"));
                int wins = (int)((long) generalStatsObject.get("wins"));
                int loses = (int)((long) generalStatsObject.get("loses"));
                int points = (int)((long) generalStatsObject.get("points"));
                listaToReturn.add(new GeneralStats(id,number_of_matches,wins,loses,points));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return listaToReturn;
    }


    public GeneralStats getGeneralStatsForPlayer(int player_id)
    {
        JSONParser parser = new JSONParser();
        try
        {
            Object obj = parser.parse(new FileReader(PLAYER_STATS_JSON_FILE_PATH));
            JSONArray playerList = (JSONArray) obj;

            for(int i = 0; i < playerList.size(); i++)
            {
                JSONObject generalStatsObject = (JSONObject) playerList.get(i);
                int id = (int)((long) generalStatsObject.get("id"));
                if(id == player_id)
                {
                    int points = (int)((long) generalStatsObject.get("points"));
                    int assists = (int)((long) generalStatsObject.get("assists"));
                    int shots = (int)((long) generalStatsObject.get("shots"));
                    return new GeneralStats(id,points,assists,shots);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public List<GeneralStats> getAllGeneralStatsForPlayers()
    {
        JSONParser parser = new JSONParser();
        List<GeneralStats> listaToReturn = new ArrayList<>();
        try
        {
            Object obj = parser.parse(new FileReader(PLAYER_STATS_JSON_FILE_PATH));
            JSONArray playerList = (JSONArray) obj;

            for(int i = 0; i < playerList.size(); i++)
            {
                JSONObject generalStatsObject = (JSONObject) playerList.get(i);
                int id = (int)((long) generalStatsObject.get("id"));
                int points = (int)((long) generalStatsObject.get("points"));
                int assists = (int)((long) generalStatsObject.get("assists"));
                int shots = (int)((long) generalStatsObject.get("shots"));
                listaToReturn.add(new GeneralStats(id,points,assists,shots));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return listaToReturn;
    }

    public List<GeneralStats> getTop3GeneralStatsByPointsForPlayer()
    {
        List<GeneralStats> getAllGeneralStats = getAllGeneralStatsForPlayers();

        getAllGeneralStats.sort((o1, o2) -> o2.getPoints() - o1.getPoints());

        return getAllGeneralStats.subList(0,3);
    }

    public List<GeneralStats> getTop3GeneralStatsByAssistsForPlayer()
    {
        List<GeneralStats> getAllGeneralStats = getAllGeneralStatsForPlayers();

        getAllGeneralStats.sort((o1, o2) -> o2.getAssists() - o1.getAssists());

        return getAllGeneralStats.subList(0,3);
    }

    public List<GeneralStats> getTop3GeneralStatsByWinsForTeams()
    {
        List<GeneralStats> getAllGeneralStats = getGeneralStatsForAllTeams();

        getAllGeneralStats.sort((o1, o2) -> o2.getWins() - o1.getWins());

        return getAllGeneralStats.subList(0,3);
    }
}
