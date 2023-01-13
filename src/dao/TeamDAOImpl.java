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
    public List<Team> getTeams(String teamNamePassed) {
        TeamCRUD teamCRUD = new TeamCRUD();
        return teamCRUD.getTeams(teamNamePassed);
    }


    @Override
    public String getTeamNameById(int id) {
        return null;
    }

    @Override
    public Team getTeamById(int id)
    {
        TeamCRUD teamCRUD = new TeamCRUD();
        return teamCRUD.getTeamById(id);
    }
}
