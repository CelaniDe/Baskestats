package dao;
import model.Player;
import model.Team;

import java.util.List;

public interface PlayerDAO
{
    public void updatePlayer();
    public void deletePlayer();
    public void addPlayer();
    public Player[] getPlayer();
    public Player getPlayerById(int player_id);
    public List<Player> getPlayers(String playerNamePassed);

}
