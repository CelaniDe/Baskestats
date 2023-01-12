package DatabaseFakeJson;

import model.Player;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class JsonArrayUtils
{
    //Used to get the last id from a json array
    public static int getLastID(JSONArray jsonArray)
    {
        long lastID = (long) ((JSONObject) jsonArray.get(jsonArray.size() -1 )).get("id");
        return (int) lastID;
    }

    //Returns a specified integer attribute of any object based on its json path and id
    public static int getIntAttributebyId(long id, String filePath, String attribute)
    {
        JSONParser parser = new JSONParser();
        try
        {
            FileReader reader = new FileReader(filePath);
            Object obj = parser.parse(reader);
            JSONArray itemList = (JSONArray) obj;
            for(int i = 0; i < itemList.size(); i++)
            {
                JSONObject itemObject = (JSONObject) itemList.get(i);
                int id_wanted = (int)((long) itemObject.get("id"));
                if(id == id_wanted)
                {
                    return (int) itemObject.get(attribute);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }

    //Returns a specified String attribute of any object based on its json path and id
    public static String getStringAttributebyId(long id, String filePath, String attribute)
    {
        JSONParser parser = new JSONParser();
        try
        {
            FileReader reader = new FileReader(filePath);
            Object obj = parser.parse(reader);
            JSONArray itemList = (JSONArray) obj;
            for(int i = 0; i < itemList.size(); i++)
            {
                JSONObject itemObject = (JSONObject) itemList.get(i);
                int id_wanted = (int)((long) itemObject.get("id"));
                if(id == id_wanted)
                {
                    return itemObject.get(attribute).toString();
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
