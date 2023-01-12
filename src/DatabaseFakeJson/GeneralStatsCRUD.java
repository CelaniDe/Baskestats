package DatabaseFakeJson;

import model.GeneralStats;
import model.Team;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GeneralStatsCRUD
{
    private static String GENERAL_STATS_JSON_FILE_PATH = "src/json_data/leagueStanding.json";

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
}
