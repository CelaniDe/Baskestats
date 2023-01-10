package dao;

import DatabaseFakeJson.AccountCRUD;
import model.Account;

public class ClientDAOImpl implements ClientDAO{

    @Override
    public void updateClient() {

    }

    @Override
    public void deleteClient() {

    }

    @Override
    public void addClient() {

    }

    @Override
    public Account getAccount(String username, String password) {
        AccountCRUD accountCRUD = new AccountCRUD();
        Account loggedIn = accountCRUD.getAccount(username,password);
        return loggedIn;
    }
}
