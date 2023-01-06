package model;

public class Match {
    private string datetime;
    private string stadium;

    public Match(string datetime) {
        this.datetime = datetime;
    }

    public Match(string stadium) {
        this.stadium = stadium;
    }

    public Match() {}

    public string getStadium() {
        return stadium;
    }

    public void setStadium(string stadium) {
        this.stadium = stadium;
    }

    public string getDatetime() {
        return datetime;
    }

    public void setDatetime(string datetime) {
        this.datetime = datetime;
    }
}
