package dao;

import model.Account;

public interface ClientDAO {
    public void updateClient();
    public void deleteClient();
    public Account addClient();
    public Account getAccount(String username, String password);
}
