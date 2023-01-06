package DatabaseFakeJson;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import model.Player;
public class PlayerCRUD {
    private String filePath = "C:\\Users\\giannhs\\IdeaProjects\\Baskestats\\src\\json_data\\players.json";

    public List<Player> getPlayers() {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(filePath));

            JSONArray playerList = (JSONArray) obj;
            List<Player> players = new ArrayList<>();

            for (int i = 0; i < playerList.size(); i++) {
                JSONObject playerObject = (JSONObject) playerList.get(i);
                String name = (String) playerObject.get("name");
                long age = (long) playerObject.get("age");
                long height = (long) playerObject.get("height");
                long weight = (long) playerObject.get("weight");
                String nationality = (String) playerObject.get("nationality");

                Player player = new Player(name, age, height, weight, nationality);
                players.add(player);
            }
            return players;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
