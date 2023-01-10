package dao;

import model.Account;

public interface ClientDAO {
    public void updateClient();
    public void deleteClient();
    public Account addClient(String username, String password);
    public Account getAccount(String username, String password);
}
