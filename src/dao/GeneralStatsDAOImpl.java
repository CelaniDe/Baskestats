package dao;

import DatabaseFakeJson.GeneralStatsCRUD;
import model.GeneralStats;

public class GeneralStatsDAOImpl implements GeneralStatsDAO
{

    @Override
    public GeneralStats getGeneralStatsForTeam(int team_id) {
        return new GeneralStatsCRUD().getGeneralStatsForTeam(team_id);
    }
}
