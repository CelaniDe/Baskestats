package DatabaseFakeJson;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import model.Match;
import model.Team;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import model.Player;

public class PlayerCRUD {
    private static String PLAYERS_JSON_FILE_PATH = "src/json_data/players.json";

    //Returns all players in the json file as a player list
    public List<Player> getPlayers()
    {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(PLAYERS_JSON_FILE_PATH));

            JSONArray playerList = (JSONArray) obj;
            List<Player> players = new ArrayList<>();

            for (int i = 0; i < playerList.size(); i++) {
                JSONObject playerObject = (JSONObject) playerList.get(i);
                int id = (int)((long)playerObject.get("id"));
                String name = (String) playerObject.get("name");
                long age = (long) playerObject.get("age");
                long height = (long) playerObject.get("height");
                long weight = (long) playerObject.get("weight");
                String nationality = (String) playerObject.get("nationality");
                int team_id = (int)((long)playerObject.get("team_id"));

                Player player = new Player(name, age, height, weight, nationality,id,team_id);
                players.add(player);
            }
            return players;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //Gets a string as parameter and returns a player list of the players that match that string in their name
    public List<Player> getPlayers(String playerNamePassed)
    {
        List<Player> allPlayers = getPlayers();
        List<Player> matchedPlayers = new ArrayList<>();
        for(Player player : allPlayers)
            if(player.getName().contains(playerNamePassed))
                matchedPlayers.add(player);

        return matchedPlayers;
    }

    //Gets a list of players as parameter and adds those players in json form in the json file
    public void insertPlayers(List<Player> players) {
        {
            JSONParser parser = new JSONParser();
            try
            {
                FileReader reader = new FileReader(PLAYERS_JSON_FILE_PATH);
                Object obj = parser.parse(reader);
                JSONArray playerList = (JSONArray) obj;
                reader.close();

                for (Player player : players) {
                    JSONObject newPlayer = new JSONObject();
                    newPlayer.put("id", JsonArrayUtils.getLastID(playerList)+1);
                    newPlayer.put("name", player.getName());
                    newPlayer.put("age", player.getAge());
                    newPlayer.put("height", player.getHeight());
                    newPlayer.put("weight", player.getWeight());
                    newPlayer.put("Nationality", player.getWeight());
                    newPlayer.put("team_id", (int)player.getTeam_id());
                    playerList.add(newPlayer);
                }
                FileWriter file = new FileWriter(PLAYERS_JSON_FILE_PATH);
                file.write(playerList.toJSONString());
                file.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    //Gets a list of integers and deletes the players with those ids
    public void deletePlayers(List<Integer> player_ids)
    {
        JSONParser parser = new JSONParser();
        try
        {
            FileReader reader = new FileReader(PLAYERS_JSON_FILE_PATH);
            Object obj = parser.parse(reader);
            JSONArray playerList = (JSONArray) obj;

            for(int player : player_ids)
            {
                for(int i = 0; i < playerList.size(); i++)
                {
                    JSONObject playerObject = (JSONObject) playerList.get(i);
                    int id = (int)((long) playerObject.get("id"));
                    if(id == player)
                    {
                        playerList.remove(i);
                    }
                }
            }

            FileWriter file = new FileWriter(PLAYERS_JSON_FILE_PATH);
            file.write(playerList.toJSONString());
            file.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //Gets int as parameter and returns players that have that team id
    public List<Player> getPlayersByTeamID(int team_id)
    {
        List<Player> allPlayers = getPlayers();
        List<Player> playersOnTeam = new ArrayList<>();
        for(Player player : allPlayers)
            if(player.getTeam_id() == team_id)
                playersOnTeam.add(player);

        return playersOnTeam;
    }

    public Player getPlayerById(int id)
    {
        List<Player> allPlayers = getPlayers();
        for(Player player : allPlayers)
        {
            if(player.getId() == id){
                return player;
            }
        }
        return null;
    }

}
