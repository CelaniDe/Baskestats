package dao;

import model.Team;

import java.util.List;

public interface TeamDAO
{
     public void updateTeam();
     public void deleteTeam();
     public void addTeam();
     public List<Team> getTeams();
     public List<Team> getTeams(String teamNamePassed);
     public String getTeamNameById(int id);
}
