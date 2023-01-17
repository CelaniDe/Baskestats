package dao;

import DatabaseFakeJson.GeneralStatsCRUD;
import model.GeneralStats;

import java.util.List;

public class GeneralStatsDAOImpl implements GeneralStatsDAO
{

    @Override
    public GeneralStats getGeneralStatsForTeam(int team_id) {
        return new GeneralStatsCRUD().getGeneralStatsForTeam(team_id);
    }
    @Override
    public GeneralStats getGeneralStatsForPlayer(int player_id) {
        return new GeneralStatsCRUD().getGeneralStatsForPlayer(player_id);
    }

    @Override
    public List<GeneralStats> getTop3GeneralStatsByPointsForPlayer() {
        GeneralStatsCRUD generalStatsCRUD = new GeneralStatsCRUD();
        return generalStatsCRUD.getTop3GeneralStatsByPointsForPlayer();
    }

    @Override
    public List<GeneralStats> getTop3GeneralStatsByWinsForTeams() {
        GeneralStatsCRUD generalStatsCRUD = new GeneralStatsCRUD();
        return generalStatsCRUD.getTop3GeneralStatsByWinsForTeams();
    }

    @Override
    public List<GeneralStats> getTop3GeneralStatsByAssistsForPlayer() {
        GeneralStatsCRUD generalStatsCRUD = new GeneralStatsCRUD();
        return generalStatsCRUD.getTop3GeneralStatsByAssistsForPlayer();
    }
}
