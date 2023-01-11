package dao;

import DatabaseFakeJson.TeamCRUD;
import model.Team;

import java.util.List;

public class TeamDAOImpl implements TeamDAO
{
    @Override
    public void updateTeam() {

    }

    @Override
    public void deleteTeam() {

    }

    @Override
    public void addTeam() {

    }

    @Override
    public List<Team> getTeams() {
        TeamCRUD teamCRUD = new TeamCRUD();
        return teamCRUD.getTeams();
    }


    @Override
    public String getTeamNameById(int id) {
        return null;
    }
}
