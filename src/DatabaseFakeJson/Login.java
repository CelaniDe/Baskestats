package DatabaseFakeJson;

import model.Account;

public class Login
{
    public Account login(String username, String password) throws WrongCredentialsException
    {
        if(username == "antonis" && password == "112233!!")
        {
            return new Account("antonis","112233!!",0,false);
        }
        else if (username == "makis" && password == "112233!!")
        {
            return new Account("makis","112233!!",0,true);
        }
        throw new WrongCredentialsException();
    }
}
