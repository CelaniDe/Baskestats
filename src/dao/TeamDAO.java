package dao;

import model.Team;

public interface TeamDAO
{
     public void updateTeam();
     public void deleteTeam();
     public void addTeam();
     public Team[] getTeams();
     public String getTeamNameById(int id);
}
