package dao;

import model.GeneralStats;

import java.util.List;

public interface GeneralStatsDAO
{
    public GeneralStats getGeneralStatsForTeam(int team_id);
    public GeneralStats getGeneralStatsForPlayer(int player_id);
    public List<GeneralStats> getTop3GeneralStatsByPointsForPlayer();
}
