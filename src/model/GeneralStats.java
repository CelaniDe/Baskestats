package model;

public class GeneralStats
{
    private int id;
    private int number_of_matches;
    private int wins;
    private int loses;
    private int points;
    private int assists;
    private int shots;

    public GeneralStats(int id, int points, int assists, int shots) {
        this.id = id;
        this.points = points;
        this.assists = assists;
        this.shots = shots;
    }

    public GeneralStats(int id, int number_of_matches, int wins, int loses, int points) {
        this.id = id;
        this.number_of_matches = number_of_matches;
        this.wins = wins;
        this.loses = loses;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
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


    public String toStringTeam() {
        return "GeneralStats{" +
                "id=" + id +
                ", number_of_matches=" + number_of_matches +
                ", wins=" + wins +
                ", loses=" + loses +
                '}';
    }

    public String toStringPlayer() {
        return "GeneralStats{" +
                "id=" + id +
                ", points=" + points +
                ", assists=" + assists +
                ", shots=" + shots +
                '}';
    }
}
