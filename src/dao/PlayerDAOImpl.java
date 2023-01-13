package dao;

import DatabaseFakeJson.PlayerCRUD;
import model.Player;

import model.Player;
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
}
