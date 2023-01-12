package DatabaseFakeJson;

import model.Team;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class TeamCRUD
{
    private static String TEAMS_JSON_FILE_PATH = "src/json_data/teams.json";

    public List<Team> getTeams()
    {
        JSONParser parser = new JSONParser();
        List<Team> teams = new ArrayList<>();
        try
        {
            Object obj = parser.parse(new FileReader(TEAMS_JSON_FILE_PATH));
            JSONArray teamList = (JSONArray) obj;

            for(int i = 0; i < teamList.size(); i++)
            {
                JSONObject teamObject = (JSONObject) teamList.get(i);
                int id = (int)((long) teamObject.get("id"));
                String name = (String) teamObject.get("name");
                String city = (String) teamObject.get("city");
                long founded = (long) teamObject.get("founded");
                String ceo = (String) teamObject.get("CEO");
                Team newTeam = new Team(id,name,city,founded,ceo);
                teams.add(newTeam);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return teams;
    }

    public void insertTeams(List<Team> teams)
    {
        try
        {
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader(TEAMS_JSON_FILE_PATH);
            Object obj = parser.parse(reader);
            JSONArray teamList = (JSONArray) obj;
            reader.close();

            for(Team team : teams)
            {
                JSONObject newTeam = new JSONObject();
                newTeam.put("id", JsonArrayUtils.getLastID(teamList) + 1);
                newTeam.put("name", team.getName());
                newTeam.put("city", team.getCity());
                newTeam.put("founded", team.getFounded());
                newTeam.put("CEO", team.getCEO());
                teamList.add(newTeam);
            }

            FileWriter file = new FileWriter(TEAMS_JSON_FILE_PATH);
            file.write(teamList.toJSONString());
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void deleteTeams(List<Integer> teams_ids)
    {
        JSONParser parser = new JSONParser();
        try
        {
            FileReader reader = new FileReader(TEAMS_JSON_FILE_PATH);
            Object obj = parser.parse(reader);
            JSONArray teamList = (JSONArray) obj;

            for(int team : teams_ids)
            {
                for(int i = 0; i < teamList.size(); i++)
                {
                    JSONObject teamObject = (JSONObject) teamList.get(i);
                    int id = (int)((long) teamObject.get("id"));
                    if(id == team)
                    {
                        teamList.remove(i);
                    }
                }
            }

            FileWriter file = new FileWriter(TEAMS_JSON_FILE_PATH);
            file.write(teamList.toJSONString());
            file.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
