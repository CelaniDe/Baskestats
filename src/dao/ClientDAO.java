package dao;

import model.Account;

public interface ClientDAO {
    public void updateClient();
    public void deleteClient();
    public void addClient();

    public Account getAccount(String username, String password);
}
