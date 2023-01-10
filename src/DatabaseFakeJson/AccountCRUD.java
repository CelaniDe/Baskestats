package DatabaseFakeJson;

import model.Account;
import model.Team;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AccountCRUD
{
    private static final String ACCOUNTS_JSON_FILE_PATH = "src/json_data/accounts.json";

    public Account getAccount(String username, String password)
    {
        JSONParser parser = new JSONParser();
        try
        {
            Object obj = parser.parse(new FileReader(ACCOUNTS_JSON_FILE_PATH));
            JSONArray accountsList = (JSONArray) obj;

            for(int i = 0; i < accountsList.size(); i++)
            {
                JSONObject accountObject = (JSONObject) accountsList.get(i);
                String nameFromJson = (String) accountObject.get("username");
                String passwordFromJson = (String) accountObject.get("password");
                long idFromJson = (long) accountObject.get("id");
                boolean accountTypeFromJson = (boolean) accountObject.get("account_type");
                if(nameFromJson == username && password == passwordFromJson)
                {
                    return new Account(nameFromJson,passwordFromJson,(int) idFromJson,accountTypeFromJson);
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
