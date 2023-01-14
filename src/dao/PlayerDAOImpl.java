package dao;

import DatabaseFakeJson.PlayerCRUD;
import model.Player;

import model.Player;

import java.util.List;

public class PlayerDAOImpl implements PlayerDAO {
    @Override
    public void updatePlayer(){

    }
    @Override
    public void deletePlayer(){

    }
    @Override
    public void addPlayer(){

    }

    @Override
    public Player[] getPlayer() {
        return new Player[0];
    }

    @Override
    public Player getPlayerById(int player_id) {
        PlayerCRUD playerCRUD = new PlayerCRUD();
        return playerCRUD.getPlayerById(player_id);
    }

    @Override
    public List<Player> getPlayers(String playerNamePassed) {
        PlayerCRUD playerCRUD = new PlayerCRUD();
        return playerCRUD.getPlayers(playerNamePassed);
    }
}
