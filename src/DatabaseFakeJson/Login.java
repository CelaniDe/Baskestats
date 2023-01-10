package DatabaseFakeJson;

import model.Account;

public class Login
{
    public Account login(String username, String password) throws WrongCredentialsException
    {
        AccountCRUD accountCRUD = new AccountCRUD();
        Account loggedIn = accountCRUD.getAccount(username,password);
        if(loggedIn == null)
            throw new WrongCredentialsException();
        else
            return loggedIn;

    }
}
