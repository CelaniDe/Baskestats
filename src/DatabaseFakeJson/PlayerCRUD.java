package DatabaseFakeJson;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import model.Player;
public class PlayerCRUD {
    public List<Player> GetPlayers() {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("players.json"));

            JSONArray playerList = (JSONArray) obj;
            List<Player> players = new ArrayList<>();

            for (int i = 0; i < playerList.size(); i++) {
                JSONObject playerObject = (JSONObject) playerList.get(i);
                String name = (String) playerObject.get("name");
                Integer age = (Integer) playerObject.get("age");
                Float height = (Float) playerObject.get("height");
                Integer weight = (Integer) playerObject.get("weight");
                String nationality = (String) playerObject.get("nationality");

                Player player = new Player(name, age.intValue(), height, weight.intValue(), nationality);
                players.add(player);
            }
            return players;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
