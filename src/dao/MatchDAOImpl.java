package dao;

import DatabaseFakeJson.MatchCRUD;
import model.Match;

import java.util.List;

public class MatchDAOImpl implements MatchDAO{
    @Override
    public void updateMatch() {

    }

    @Override
    public void deleteMatch() {

    }

    @Override
    public void addMatch() {

    }

    @Override
    public List<Match> getFutureMatches() {
        MatchCRUD matchCRUD = new MatchCRUD();
        return matchCRUD.getFutureMatches();
    }

    @Override
    public List<Match> getPastMatches() {
        MatchCRUD matchCRUD = new MatchCRUD();
        return matchCRUD.getPastMatches();
    }

    @Override
    public List<Match> getTodayMatches() {
        MatchCRUD matchCRUD = new MatchCRUD();
        return matchCRUD.getTodayMatches();
    }
}