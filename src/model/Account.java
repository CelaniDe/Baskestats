package model;

public class Account {
    private String username;
    private String password;
    private int id;
    private boolean account_type;

    public Account(String username, String password, int id, boolean account_type) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.account_type = account_type;
    }

    public Account() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAccount_type() {
        return account_type;
    }

    public void setAccount_type(boolean account_type) {
        this.account_type = account_type;
    }
}
