package DatabaseFakeJson;

import model.Team;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TeamCRUD
{
//    private static String TEAMS_JSON_FILE_PATH = "C:\\Users\\CelaniDe\\Desktop\\Baskestats\\src\\json_data\\teams.json";
    public List<Team> getTeams()
    {
        File file = new File("src/json_dat/teams.json");
        JSONParser parser = new JSONParser();
        List<Team> teams = new ArrayList<>();
        try
        {
            Object obj = parser.parse(new FileReader(file));
            JSONArray teamList = (JSONArray) obj;

            for(int i = 0; i < teamList.size(); i++)
            {
                JSONObject playerObject = (JSONObject) teamList.get(i);
                String name = (String) playerObject.get("name");
                String city = (String) playerObject.get("city");
                long founded = (long) playerObject.get("founded");
                String ceo = (String) playerObject.get("CEO");
                Team newTeam = new Team(name,city,founded,ceo);
                teams.add(newTeam);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return teams;
    }


}
