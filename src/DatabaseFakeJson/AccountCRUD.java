package DatabaseFakeJson;

import model.Account;
import model.Team;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class AccountCRUD
{
    private static final String ACCOUNTS_JSON_FILE_PATH = "src/json_data/accounts.json";

    // Gets 2 strings as username and password and returns the matched account. If there is no account
    // that matches, it returns null
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
                System.out.println("nameFromJson -> " + nameFromJson);
                System.out.println("passwordFromJson -> " + passwordFromJson);

                System.out.println("namePassed -> " + username);
                System.out.println("passwordPassed -> " + password);
                if(nameFromJson.equals(username)  && password.equals(passwordFromJson))
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

    //Gets username and password and creates a new client account
    public Account insertAccount(String username, String password) {
        if (existsAccount(username)){
            return null;
        }
        else {
            JSONParser parser = new JSONParser();

            try {
                FileReader reader = new FileReader(ACCOUNTS_JSON_FILE_PATH);
                Object obj = parser.parse(reader);
                JSONArray accountList = (JSONArray) obj;
                reader.close();
                int last_id = JsonArrayUtils.getLastID(accountList) + 1;

                JSONObject newAccount = new JSONObject();
                newAccount.put("username", username);
                newAccount.put("password", password);
                newAccount.put("id", last_id);
                newAccount.put("account_type", false);
                accountList.add(newAccount);

                Account accountToReturn = new Account(username, password, last_id, false);

                FileWriter file = new FileWriter(ACCOUNTS_JSON_FILE_PATH);
                file.write(accountList.toJSONString());
                file.close();
                return accountToReturn;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    //Gets a string as username and returns true if there is an account with that username and
    // false if there is not
    public boolean existsAccount(String username)
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
                if(nameFromJson.equals(username))
                {
                    return true;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
