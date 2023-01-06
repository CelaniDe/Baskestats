package dao;
import model.Player;

public interface PlayerDAO
{
    public void updatePlayer();
    public void deletePlayer();
    public void addPlayer();
    public Player[] getPlayer();

}
