package model;

public class GeneralStats
{
    private int team_id;
    private int number_of_matches;
    private int wins;
    private int loses;
    private int points;

    public GeneralStats(int team_id,int number_of_matches, int wins, int loses, int points) {
        this.team_id = team_id;
        this.number_of_matches = number_of_matches;
        this.wins = wins;
        this.loses = loses;
        this.points = points;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public int getNumber_of_matches() {
        return number_of_matches;
    }

    public void setNumber_of_matches(int number_of_matches) {
        this.number_of_matches = number_of_matches;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "GeneralStats{" +
                "team_id=" + team_id +
                ", number_of_matches=" + number_of_matches +
                ", wins=" + wins +
                ", loses=" + loses +
                ", points=" + points +
                '}';
    }
}
