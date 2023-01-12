package dao;

import model.Match;

import java.util.List;

public interface MatchDAO {
    public void updateMatch(

    );

    public void deleteMatch(

    );

    public void addMatch(

    );

    public List<Match> getFutureMatches();

    public List<Match> getPastMatches();

    public List<Match> getTodayMatches();
}
