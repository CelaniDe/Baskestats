package model;

public class Match {
    private String datetime;
    private String stadium;

    public Match(String datetime) {
        this.datetime = datetime;
    }

    public Match(String stadium) {
        this.stadium = stadium;
    }

    public Match() {}

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}
