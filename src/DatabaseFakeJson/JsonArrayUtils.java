package DatabaseFakeJson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonArrayUtils
{
    public static int getLastID(JSONArray jsonArray)
    {
        long lastID = (long) ((JSONObject) jsonArray.get(jsonArray.size() -1 )).get("id");
        return (int) lastID;
    }
}
